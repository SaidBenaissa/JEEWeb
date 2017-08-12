# How to install tomcat
Air:.Trash benaissa$ sudo rm -r /usr/local/apache-tomcat-9.0.0.M26/

Air:.Trash benaissa$ sudo mv ~/Downloads/apache-tomcat-9.0.0.M26/ /usr/local
Air:.Trash benaissa$ sudo rm -f /Library/T
TeX/    Tomcat  
Air:.Trash benaissa$ sudo rm -f /Library/Tomcat 
Air:.Trash benaissa$ sudo ln -s /usr/local/apache-tomcat-9.0.0.M26/ /Library/Tomcat
Air:.Trash benaissa$ sudo chown -R benaissa /Library/Tomcat
Air:.Trash benaissa$ sudo chmod +x /Library/Tomcat/bin/*
bootstrap.jar                 commons-daemon-native.tar.gz  daemon.sh                     setclasspath.sh               startup.sh                    tool-wrapper.sh
catalina-tasks.xml            commons-daemon.jar            digest.bat                    shutdown.bat                  tomcat-juli.jar               version.bat
catalina.bat                  configtest.bat                digest.sh                     shutdown.sh                   tomcat-native.tar.gz          version.sh
catalina.sh                   configtest.sh                 setclasspath.bat              startup.bat                   tool-wrapper.bat              
Air:.Trash benaissa$ sudo chmod +x /Library/Tomcat/bin/*.sh
