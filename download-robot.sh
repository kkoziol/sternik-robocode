curl $1 | grep browser_download_url | awk -F\" '{print $4}' | xargs curl -LOJ