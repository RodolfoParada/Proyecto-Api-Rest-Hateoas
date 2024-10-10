# Se realizó una API REST utilizando la librería de HATEOAS.

## Las dependencias que se incorporaron al proyecto son: 
- Spring Hateoas 
- Spring Data JPA 
- MySQL Driver 
- Spring Web
- Lombok

 # se realizó servicios con endpoint de : 
 
**Get Listar Cuentas**
```java
http://localhost:8080/api/cuentas
```
**Get Obtener Cuentas**
```java
http://localhost:8080/api/cuentas/3
```
**Patch Deposito Cuentas**
```java
http://localhost:8080/api/cuentas/2/deposito
```
**Patch retiro Cuentas**
```java
http://localhost:8080/api/cuentas/2/retiro
```
**Post guardar Cuentas**
```java
http://localhost:8080/api/cuentas
```
**Put editar Cuentas**
```java
http://localhost:8080/api/cuentas
```
**Delete editar Cuentas**
```java
http://localhost:8080/api/cuentas/3
```
# La conexión a la base de datos es: 
**conexión**
```java
spring.application.name=Proyecto-02
spring.datasource.url=jdbc:mysql://localhost:3306/cuenta_api_rest_bd?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=ContrañaMySql
#spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
#spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```
