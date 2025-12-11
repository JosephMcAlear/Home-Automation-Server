sudo apt update && sudo apt upgrade

sudo apt install git

sudo apt install docker-compose

git pull https://github.com/JosephMcAlear/Home-Automation-Server.git

cd Home-Automation-Server

git checkout deploy

docker-compose build

