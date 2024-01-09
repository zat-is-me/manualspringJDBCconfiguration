# Changing Spring AutoConfiguration into Manual Configuration
1, First disable the bottom two classes

    JdbcTemplateAutoConfiguration.class
    DataSourceAutoConfiguration.class 

2, Create own data source client bean using the following class

    DriverManagerDataSource or
    ComboPooledDataSource
    
