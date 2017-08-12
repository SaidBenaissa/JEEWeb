# How to install tomcat
Air:.Trash benaissa$ sudo rm -r /usr/local/apache-tomcat-9.0.0.M26/

Air:.Trash benaissa$ sudo mv ~/Downloads/apache-tomcat-9.0.0.M26/ /usr/local

Air:.Trash benaissa$ sudo rm -f /Library/Tomcat 

Air:.Trash benaissa$ sudo ln -s /usr/local/apache-tomcat-9.0.0.M26/ /Library/Tomcat

Air:.Trash benaissa$ sudo chown -R benaissa /Library/Tomcat

Air:.Trash benaissa$ sudo chmod +x /Library/Tomcat/bin/*
           
Air:.Trash benaissa$ sudo chmod +x /Library/Tomcat/bin/*.sh
