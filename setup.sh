#!/bin/bash

# This script is used to initialize the environment for the PhotoFrame Server application.
# It will create a directory called .photoframe and a configuration file called photoframe-application.properties.
# This properties file will contain default values that can be changed at any time.

photoframe_dir=".photoframe"
photoframe_conf_name="photoframe-application.properties"
#photoframe_jarfile_url="https://github.com/amandagrono/photoframe/photoframe_default_conf.properties"

execute_script() {
  echo "Script is being executed"
  echo "$HOME"
  cd "$HOME" || return
  mkdir "$photoframe_dir" && cd "$photoframe_dir" || return
  echo "photos_directory" >> $photoframe_conf_name

}

if [ $EUID = 0 ]
  then
    echo "Please do not run this script as root"
    exit 1
  else
    execute_script
    exit 0
fi

