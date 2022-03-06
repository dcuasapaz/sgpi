# Copy file in path
sudo cp sgpi_dvl_20220304.bkp /var/lib/postgresql/

# Conect user postgres
sudo -i -u postgres

# Run pg_restore, preview create user and database
pg_restore -h localhost -p 5432 -U sgpi -d sgpi_dvl -v sgpi_dvl_20220304.bkp
