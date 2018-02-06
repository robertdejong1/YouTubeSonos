package youtubesonos;

import smapi.Credentials;
import youtubesonos.youtube.YT;

import java.io.IOException;
import java.security.SecureRandom;

public class SonosAuth {

    private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static SecureRandom random = new SecureRandom();

    public static String generateLinkCode() {
        return randomString(32);
    }

    public static String generateUserId() {
        return randomString(2040);
    }

    private static String randomString( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( random.nextInt(AB.length()) ) );
        return sb.toString();
    }

    public static String getUserId(Credentials credentials) {
        return credentials.getLoginToken().getToken();
    }

    public static VerifyCredentialsResult verifyCredentials(Credentials credentials) throws IOException {
        String userId = getUserId(credentials);
        return new VerifyCredentialsResult(YT.isUserAuthorized(userId), YT.isUserExpired(userId));
    }

    public static class VerifyCredentialsResult {
        private boolean isAuthorized, isExpired;

        public VerifyCredentialsResult(boolean isAuthorized, boolean isExpired) {
            this.isAuthorized = isAuthorized;
            this.isExpired = isExpired;
        }

        public boolean isAuthorized() {
            return isAuthorized;
        }

        public boolean isExpired() {
            return isExpired;
        }
    }
}
