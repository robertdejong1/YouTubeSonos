
package smapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the smapi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Password_QNAME = new QName("http://www.sonos.com/Services/1.1", "password");
    private final static QName _ItemType_QNAME = new QName("http://www.sonos.com/Services/1.1", "itemType");
    private final static QName _Nickname_QNAME = new QName("http://www.sonos.com/Services/1.1", "nickname");
    private final static QName _MediaUriAction_QNAME = new QName("http://www.sonos.com/Services/1.1", "mediaUriAction");
    private final static QName _Id_QNAME = new QName("http://www.sonos.com/Services/1.1", "id");
    private final static QName _SessionId_QNAME = new QName("http://www.sonos.com/Services/1.1", "sessionId");
    private final static QName _Label_QNAME = new QName("http://www.sonos.com/Services/1.1", "label");
    private final static QName _Username_QNAME = new QName("http://www.sonos.com/Services/1.1", "username");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: smapi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link AddToContainerResponse }
     * 
     */
    public AddToContainerResponse createAddToContainerResponse() {
        return new AddToContainerResponse();
    }

    /**
     * Create an instance of {@link AddToContainerResult }
     * 
     */
    public AddToContainerResult createAddToContainerResult() {
        return new AddToContainerResult();
    }

    /**
     * Create an instance of {@link CreateItemResponse }
     * 
     */
    public CreateItemResponse createCreateItemResponse() {
        return new CreateItemResponse();
    }

    /**
     * Create an instance of {@link AppLinkInfo }
     * 
     */
    public AppLinkInfo createAppLinkInfo() {
        return new AppLinkInfo();
    }

    /**
     * Create an instance of {@link GetAppLink }
     * 
     */
    public GetAppLink createGetAppLink() {
        return new GetAppLink();
    }

    /**
     * Create an instance of {@link GetAppLinkResponse }
     * 
     */
    public GetAppLinkResponse createGetAppLinkResponse() {
        return new GetAppLinkResponse();
    }

    /**
     * Create an instance of {@link RateItemResponse }
     * 
     */
    public RateItemResponse createRateItemResponse() {
        return new RateItemResponse();
    }

    /**
     * Create an instance of {@link GetUserInfoResponse }
     * 
     */
    public GetUserInfoResponse createGetUserInfoResponse() {
        return new GetUserInfoResponse();
    }

    /**
     * Create an instance of {@link DeleteItemResponse }
     * 
     */
    public DeleteItemResponse createDeleteItemResponse() {
        return new DeleteItemResponse();
    }

    /**
     * Create an instance of {@link SimpleHttpRequestAction }
     * 
     */
    public SimpleHttpRequestAction createSimpleHttpRequestAction() {
        return new SimpleHttpRequestAction();
    }

    /**
     * Create an instance of {@link ReportStatus }
     * 
     */
    public ReportStatus createReportStatus() {
        return new ReportStatus();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link GetExtendedMetadataTextResponse }
     * 
     */
    public GetExtendedMetadataTextResponse createGetExtendedMetadataTextResponse() {
        return new GetExtendedMetadataTextResponse();
    }

    /**
     * Create an instance of {@link RemoveFromContainer }
     * 
     */
    public RemoveFromContainer createRemoveFromContainer() {
        return new RemoveFromContainer();
    }

    /**
     * Create an instance of {@link DeleteContainer }
     * 
     */
    public DeleteContainer createDeleteContainer() {
        return new DeleteContainer();
    }

    /**
     * Create an instance of {@link LoginToken }
     * 
     */
    public LoginToken createLoginToken() {
        return new LoginToken();
    }

    /**
     * Create an instance of {@link ReorderContainer }
     * 
     */
    public ReorderContainer createReorderContainer() {
        return new ReorderContainer();
    }

    /**
     * Create an instance of {@link CustomFaultDetail }
     * 
     */
    public CustomFaultDetail createCustomFaultDetail() {
        return new CustomFaultDetail();
    }

    /**
     * Create an instance of {@link CreateContainer }
     * 
     */
    public CreateContainer createCreateContainer() {
        return new CreateContainer();
    }

    /**
     * Create an instance of {@link GetDeviceLinkCode }
     * 
     */
    public GetDeviceLinkCode createGetDeviceLinkCode() {
        return new GetDeviceLinkCode();
    }

    /**
     * Create an instance of {@link StreamMetadata }
     * 
     */
    public StreamMetadata createStreamMetadata() {
        return new StreamMetadata();
    }

    /**
     * Create an instance of {@link RadioTrackList }
     * 
     */
    public RadioTrackList createRadioTrackList() {
        return new RadioTrackList();
    }

    /**
     * Create an instance of {@link ReportStatusResponse }
     * 
     */
    public ReportStatusResponse createReportStatusResponse() {
        return new ReportStatusResponse();
    }

    /**
     * Create an instance of {@link GetScrollIndicesResponse }
     * 
     */
    public GetScrollIndicesResponse createGetScrollIndicesResponse() {
        return new GetScrollIndicesResponse();
    }

    /**
     * Create an instance of {@link AppLinkResult }
     * 
     */
    public AppLinkResult createAppLinkResult() {
        return new AppLinkResult();
    }

    /**
     * Create an instance of {@link GetLastUpdateResponse }
     * 
     */
    public GetLastUpdateResponse createGetLastUpdateResponse() {
        return new GetLastUpdateResponse();
    }

    /**
     * Create an instance of {@link GetExtendedMetadataText }
     * 
     */
    public GetExtendedMetadataText createGetExtendedMetadataText() {
        return new GetExtendedMetadataText();
    }

    /**
     * Create an instance of {@link GetContentKey }
     * 
     */
    public GetContentKey createGetContentKey() {
        return new GetContentKey();
    }

    /**
     * Create an instance of {@link ReportPlaySeconds }
     * 
     */
    public ReportPlaySeconds createReportPlaySeconds() {
        return new ReportPlaySeconds();
    }

    /**
     * Create an instance of {@link GetSessionIdResponse }
     * 
     */
    public GetSessionIdResponse createGetSessionIdResponse() {
        return new GetSessionIdResponse();
    }

    /**
     * Create an instance of {@link ReportPlayStatus }
     * 
     */
    public ReportPlayStatus createReportPlayStatus() {
        return new ReportPlayStatus();
    }

    /**
     * Create an instance of {@link ReportPlaySecondsResult }
     * 
     */
    public ReportPlaySecondsResult createReportPlaySecondsResult() {
        return new ReportPlaySecondsResult();
    }

    /**
     * Create an instance of {@link RefreshAuthToken }
     * 
     */
    public RefreshAuthToken createRefreshAuthToken() {
        return new RefreshAuthToken();
    }

    /**
     * Create an instance of {@link DeleteItem }
     * 
     */
    public DeleteItem createDeleteItem() {
        return new DeleteItem();
    }

    /**
     * Create an instance of {@link CallToActionInfo }
     * 
     */
    public CallToActionInfo createCallToActionInfo() {
        return new CallToActionInfo();
    }

    /**
     * Create an instance of {@link GetScrollIndices }
     * 
     */
    public GetScrollIndices createGetScrollIndices() {
        return new GetScrollIndices();
    }

    /**
     * Create an instance of {@link GetUserInfo }
     * 
     */
    public GetUserInfo createGetUserInfo() {
        return new GetUserInfo();
    }

    /**
     * Create an instance of {@link BehaviorsData }
     * 
     */
    public BehaviorsData createBehaviorsData() {
        return new BehaviorsData();
    }

    /**
     * Create an instance of {@link GetExtendedMetadata }
     * 
     */
    public GetExtendedMetadata createGetExtendedMetadata() {
        return new GetExtendedMetadata();
    }

    /**
     * Create an instance of {@link SetPlayedSecondsResponse }
     * 
     */
    public SetPlayedSecondsResponse createSetPlayedSecondsResponse() {
        return new SetPlayedSecondsResponse();
    }

    /**
     * Create an instance of {@link ReportPlayStatusResponse }
     * 
     */
    public ReportPlayStatusResponse createReportPlayStatusResponse() {
        return new ReportPlayStatusResponse();
    }

    /**
     * Create an instance of {@link RelatedPlay }
     * 
     */
    public RelatedPlay createRelatedPlay() {
        return new RelatedPlay();
    }

    /**
     * Create an instance of {@link DeleteContainerResponse }
     * 
     */
    public DeleteContainerResponse createDeleteContainerResponse() {
        return new DeleteContainerResponse();
    }

    /**
     * Create an instance of {@link GetExtendedMetadataResponse }
     * 
     */
    public GetExtendedMetadataResponse createGetExtendedMetadataResponse() {
        return new GetExtendedMetadataResponse();
    }

    /**
     * Create an instance of {@link HttpHeaders }
     * 
     */
    public HttpHeaders createHttpHeaders() {
        return new HttpHeaders();
    }

    /**
     * Create an instance of {@link SegmentMetadataList }
     * 
     */
    public SegmentMetadataList createSegmentMetadataList() {
        return new SegmentMetadataList();
    }

    /**
     * Create an instance of {@link RelatedText }
     * 
     */
    public RelatedText createRelatedText() {
        return new RelatedText();
    }

    /**
     * Create an instance of {@link ContentKey }
     * 
     */
    public ContentKey createContentKey() {
        return new ContentKey();
    }

    /**
     * Create an instance of {@link DeviceAuthTokenResult }
     * 
     */
    public DeviceAuthTokenResult createDeviceAuthTokenResult() {
        return new DeviceAuthTokenResult();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link GetDeviceAuthToken }
     * 
     */
    public GetDeviceAuthToken createGetDeviceAuthToken() {
        return new GetDeviceAuthToken();
    }

    /**
     * Create an instance of {@link DeviceLinkCodeResult }
     * 
     */
    public DeviceLinkCodeResult createDeviceLinkCodeResult() {
        return new DeviceLinkCodeResult();
    }

    /**
     * Create an instance of {@link CreateItem }
     * 
     */
    public CreateItem createCreateItem() {
        return new CreateItem();
    }

    /**
     * Create an instance of {@link SegmentMetadata }
     * 
     */
    public SegmentMetadata createSegmentMetadata() {
        return new SegmentMetadata();
    }

    /**
     * Create an instance of {@link GetContentKeyResponse }
     * 
     */
    public GetContentKeyResponse createGetContentKeyResponse() {
        return new GetContentKeyResponse();
    }

    /**
     * Create an instance of {@link SetPlayedSeconds }
     * 
     */
    public SetPlayedSeconds createSetPlayedSeconds() {
        return new SetPlayedSeconds();
    }

    /**
     * Create an instance of {@link MediaCollection }
     * 
     */
    public MediaCollection createMediaCollection() {
        return new MediaCollection();
    }

    /**
     * Create an instance of {@link RelatedActions }
     * 
     */
    public RelatedActions createRelatedActions() {
        return new RelatedActions();
    }

    /**
     * Create an instance of {@link GetMediaURI }
     * 
     */
    public GetMediaURI createGetMediaURI() {
        return new GetMediaURI();
    }

    /**
     * Create an instance of {@link ExtendedMetadata }
     * 
     */
    public ExtendedMetadata createExtendedMetadata() {
        return new ExtendedMetadata();
    }

    /**
     * Create an instance of {@link ReorderContainerResult }
     * 
     */
    public ReorderContainerResult createReorderContainerResult() {
        return new ReorderContainerResult();
    }

    /**
     * Create an instance of {@link RemoveFromContainerResponse }
     * 
     */
    public RemoveFromContainerResponse createRemoveFromContainerResponse() {
        return new RemoveFromContainerResponse();
    }

    /**
     * Create an instance of {@link GetMediaMetadata }
     * 
     */
    public GetMediaMetadata createGetMediaMetadata() {
        return new GetMediaMetadata();
    }

    /**
     * Create an instance of {@link CreateContainerResponse }
     * 
     */
    public CreateContainerResponse createCreateContainerResponse() {
        return new CreateContainerResponse();
    }

    /**
     * Create an instance of {@link OpenUrlAction }
     * 
     */
    public OpenUrlAction createOpenUrlAction() {
        return new OpenUrlAction();
    }

    /**
     * Create an instance of {@link TagsData }
     * 
     */
    public TagsData createTagsData() {
        return new TagsData();
    }

    /**
     * Create an instance of {@link ReportPlaySecondsResponse }
     * 
     */
    public ReportPlaySecondsResponse createReportPlaySecondsResponse() {
        return new ReportPlaySecondsResponse();
    }

    /**
     * Create an instance of {@link ReportAccountActionResponse }
     * 
     */
    public ReportAccountActionResponse createReportAccountActionResponse() {
        return new ReportAccountActionResponse();
    }

    /**
     * Create an instance of {@link ItemRating }
     * 
     */
    public ItemRating createItemRating() {
        return new ItemRating();
    }

    /**
     * Create an instance of {@link RefreshAuthTokenResponse }
     * 
     */
    public RefreshAuthTokenResponse createRefreshAuthTokenResponse() {
        return new RefreshAuthTokenResponse();
    }

    /**
     * Create an instance of {@link GetMediaURIResponse }
     * 
     */
    public GetMediaURIResponse createGetMediaURIResponse() {
        return new GetMediaURIResponse();
    }

    /**
     * Create an instance of {@link GetDeviceAuthTokenResponse }
     * 
     */
    public GetDeviceAuthTokenResponse createGetDeviceAuthTokenResponse() {
        return new GetDeviceAuthTokenResponse();
    }

    /**
     * Create an instance of {@link GetStreamingMetadataResponse }
     * 
     */
    public GetStreamingMetadataResponse createGetStreamingMetadataResponse() {
        return new GetStreamingMetadataResponse();
    }

    /**
     * Create an instance of {@link GetLastUpdate }
     * 
     */
    public GetLastUpdate createGetLastUpdate() {
        return new GetLastUpdate();
    }

    /**
     * Create an instance of {@link RenameContainerResult }
     * 
     */
    public RenameContainerResult createRenameContainerResult() {
        return new RenameContainerResult();
    }

    /**
     * Create an instance of {@link RateItem }
     * 
     */
    public RateItem createRateItem() {
        return new RateItem();
    }

    /**
     * Create an instance of {@link DeleteContainerResult }
     * 
     */
    public DeleteContainerResult createDeleteContainerResult() {
        return new DeleteContainerResult();
    }

    /**
     * Create an instance of {@link Context }
     * 
     */
    public Context createContext() {
        return new Context();
    }

    /**
     * Create an instance of {@link RelatedBrowse }
     * 
     */
    public RelatedBrowse createRelatedBrowse() {
        return new RelatedBrowse();
    }

    /**
     * Create an instance of {@link RemoveFromContainerResult }
     * 
     */
    public RemoveFromContainerResult createRemoveFromContainerResult() {
        return new RemoveFromContainerResult();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link TrackMetadata }
     * 
     */
    public TrackMetadata createTrackMetadata() {
        return new TrackMetadata();
    }

    /**
     * Create an instance of {@link GetMetadata }
     * 
     */
    public GetMetadata createGetMetadata() {
        return new GetMetadata();
    }

    /**
     * Create an instance of {@link HttpHeader }
     * 
     */
    public HttpHeader createHttpHeader() {
        return new HttpHeader();
    }

    /**
     * Create an instance of {@link GenericAction }
     * 
     */
    public GenericAction createGenericAction() {
        return new GenericAction();
    }

    /**
     * Create an instance of {@link GetDeviceLinkCodeResponse }
     * 
     */
    public GetDeviceLinkCodeResponse createGetDeviceLinkCodeResponse() {
        return new GetDeviceLinkCodeResponse();
    }

    /**
     * Create an instance of {@link ReorderContainerResponse }
     * 
     */
    public ReorderContainerResponse createReorderContainerResponse() {
        return new ReorderContainerResponse();
    }

    /**
     * Create an instance of {@link GetMediaMetadataResponse }
     * 
     */
    public GetMediaMetadataResponse createGetMediaMetadataResponse() {
        return new GetMediaMetadataResponse();
    }

    /**
     * Create an instance of {@link MediaMetadata }
     * 
     */
    public MediaMetadata createMediaMetadata() {
        return new MediaMetadata();
    }

    /**
     * Create an instance of {@link DynamicData }
     * 
     */
    public DynamicData createDynamicData() {
        return new DynamicData();
    }

    /**
     * Create an instance of {@link CreateContainerResult }
     * 
     */
    public CreateContainerResult createCreateContainerResult() {
        return new CreateContainerResult();
    }

    /**
     * Create an instance of {@link ReportAccountAction }
     * 
     */
    public ReportAccountAction createReportAccountAction() {
        return new ReportAccountAction();
    }

    /**
     * Create an instance of {@link MediaList }
     * 
     */
    public MediaList createMediaList() {
        return new MediaList();
    }

    /**
     * Create an instance of {@link RenameContainer }
     * 
     */
    public RenameContainer createRenameContainer() {
        return new RenameContainer();
    }

    /**
     * Create an instance of {@link AlbumArtUrl }
     * 
     */
    public AlbumArtUrl createAlbumArtUrl() {
        return new AlbumArtUrl();
    }

    /**
     * Create an instance of {@link RenameContainerResponse }
     * 
     */
    public RenameContainerResponse createRenameContainerResponse() {
        return new RenameContainerResponse();
    }

    /**
     * Create an instance of {@link PositionInformation }
     * 
     */
    public PositionInformation createPositionInformation() {
        return new PositionInformation();
    }

    /**
     * Create an instance of {@link AddToContainer }
     * 
     */
    public AddToContainer createAddToContainer() {
        return new AddToContainer();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link GetStreamingMetadata }
     * 
     */
    public GetStreamingMetadata createGetStreamingMetadata() {
        return new GetStreamingMetadata();
    }

    /**
     * Create an instance of {@link GetSessionId }
     * 
     */
    public GetSessionId createGetSessionId() {
        return new GetSessionId();
    }

    /**
     * Create an instance of {@link EncryptionContext }
     * 
     */
    public EncryptionContext createEncryptionContext() {
        return new EncryptionContext();
    }

    /**
     * Create an instance of {@link GetMetadataResponse }
     * 
     */
    public GetMetadataResponse createGetMetadataResponse() {
        return new GetMetadataResponse();
    }

    /**
     * Create an instance of {@link LastUpdate }
     * 
     */
    public LastUpdate createLastUpdate() {
        return new LastUpdate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sonos.com/Services/1.1", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sonos.com/Services/1.1", name = "itemType")
    public JAXBElement<ItemType> createItemType(ItemType value) {
        return new JAXBElement<ItemType>(_ItemType_QNAME, ItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sonos.com/Services/1.1", name = "nickname")
    public JAXBElement<String> createNickname(String value) {
        return new JAXBElement<String>(_Nickname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaUriAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sonos.com/Services/1.1", name = "mediaUriAction")
    public JAXBElement<MediaUriAction> createMediaUriAction(MediaUriAction value) {
        return new JAXBElement<MediaUriAction>(_MediaUriAction_QNAME, MediaUriAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sonos.com/Services/1.1", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sonos.com/Services/1.1", name = "sessionId")
    public JAXBElement<String> createSessionId(String value) {
        return new JAXBElement<String>(_SessionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sonos.com/Services/1.1", name = "label")
    public JAXBElement<String> createLabel(String value) {
        return new JAXBElement<String>(_Label_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sonos.com/Services/1.1", name = "username")
    public JAXBElement<String> createUsername(String value) {
        return new JAXBElement<String>(_Username_QNAME, String.class, null, value);
    }

}
