<?php

if (isset($_GET["video"])) {
    $videoId = $_GET["video"];
    $urlName = '/ytfiles/' .$videoId .'.m4a';
    $filename = __DIR__ .$urlName;

    if (!file_exists($filename)) {
       shell_exec('youtube-dl -f m4a -o "ytfiles/%(id)s.%(ext)s" https://www.youtube.com/watch?v=' .$videoId);
    }
}

?>
