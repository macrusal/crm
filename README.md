Docker - SqlServer
0 - Baixar a imagem
sudo docker pull mcr.microsoft.com/mssql/server:2017-latest

1 - Criar o Docker com volume
sudo docker run -e 'ACCEPT_EULA=Y' -e "SA_PASSWORD=123456@" -p 1433:1433 --name sqlserver -v /Users/marcelo/desenvolvimento/database/mssql:/var/opt/mssql -d mcr.microsoft.com/mssql/server:2017-latest

1.1 - Criar o Docker sem volume
sudo docker run -e 'ACCEPT_EULA=Y' -e "SA_PASSWORD=123456@" -p 1433:1433 --name sqlserver -d mcr.microsoft.com/mssql/server:2017-latest

2 - Use o comando docker exec -it para iniciar um shell bash interativo dentro do contêiner em execução
sudo docker exec -it sqlserver "bash"

2.1 - Quando estiver dentro do contêiner, conecte-se localmente com a sqlcmd.
	  ***É possível omitir a senha na linha de comando para receber uma solicitação para inseri-la***
/opt/mssql-tools/bin/sqlcmd -S localhost -U SA
password:  123456@