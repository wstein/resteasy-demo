# Getting started with REST Services using RESTEasy

## Create your first RESTful service

### Step 1: create maven-archetype-webapp

```bash
mvn archetype:generate -DgroupId=de.wstein.demo.resteasy -DartifactId=resteasy-demo -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
```

### Build package

```bash
mvn clean package
# or
mvn clean install
```

### Create container

```bash
podman run -it --rm -p 8080:8080 --name tomcat tomcat:9.0
```

### deploy to container

```bash
podman cp target/resteasy-demo.war tomcat:/usr/local/tomcat/webapps
```

### cleanup container

```bash
podman exec tomcat rm -rf /usr/local/tomcat/webapps/resteasy-demo.war /usr/local/tomcat/webapps/resteasy-demo 
```

http://www.mastertheboss.com/jboss-frameworks/resteasy/resteasy-tutorial/