# Reference
Packt cucumber cookbook

>sqlplus /nolog

>connect / as sysdba;

Creating a user: (!!!!!NOT WORKING SINCE THE FOLLOWING CREATE A COMMON USER - RATHER THAN A CONTAINER USER, and 
so need to conform to some naming rule. ONLY applies to Oracle 12c?
e.g. 
CREATE USER chi IDENTIFIED BY chi;
GRANT CONNECT TO chi;
GRANT CONNECT, RESOURCE, DBA TO chi;
GRANT CREATE SESSION 
GRANT ANY PRIVILEGE TO chi;
GRANT UNLIMITED TABLESPACE TO chi;
GRANT SELECT, INSERT, UPDATE, DELETE ON admin TO chi;

Twelve-Factor App:
-------------------
https://12factor.net/

Australia Post API:
-------------------
https://developers.auspost.com.au/apis/sf/reference
https://developers.auspost.com.au/docs/reference


Deploying Spring Boot Applications_WITH_TOMCAT:
-----------------------------------------------
https://spring.io/blog/2014/03/07/deploying-spring-boot-applications

Configuring Spring Boot for Oracle - DZone Java:
-------------------------------------------------
https://dzone.com/articles/configuring-spring-boot-for-oracle

5 Basic REST API Design Guidelines - DZone Integration
-------------------------------------------------------
https://dzone.com/articles/5-basic-rest-api-design-guidelines?edition=220209&utm_source=Spotlight&utm_medium=email&utm_campaign=integration%202016-10-06


Spring Data REST:
-----------------
http://projects.spring.io/spring-data-rest/




