@echo off 
for /F "tokens=1,2,3 delims=-" %%i IN ('date /t') do ( 
echo %%i
echo %%j
echo %%k
set datestr=%%i%%j%%k
)
set datestr=%datestr: =%
echo datestr is %datestr%
set BACKUP_FILE=C:\Wrk\Rps\GitHub\gidi\DB\sgpi_dvl_%datestr%.bkp
SET PGPASSWORD=Sgpi!DvlEnv
echo on
cd C:\Program Files\PostgreSQL\14\bin
pg_dump -h localhost -p 65000 -U sgpi -F c -b -v -f "%BACKUP_FILE%" sgpi_dvl
pause