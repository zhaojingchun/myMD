```xml

<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
	<localRepository>/home/maven/repos/comm-repo/</localRepository>
	<activeProfiles>
		<activeProfile>local</activeProfile>
                <activeProfile>production</activeProfile>
                <activeProfile>maven-scanner</activeProfile>
	</activeProfiles>

 <mirrors>
      <mirror>
          <id>nexus</id>
          <mirrorOf>*</mirrorOf>
          <url>http://maven.yihaodian.cn/content/repositories/public</url>
      </mirror>
   </mirrors>

	<profiles>
		<profile>
			<id>local</id>
			<activation>
				<activeByDefault>true</activeByDefault>
			</activation>
                        <properties>
                            <dependency.scanner.skip>false</dependency.scanner.skip>
                            <dependency.scanner.breakBuild>true</dependency.scanner.breakBuild>
                        </properties>
			<repositories>
				<repository>
					<id>yihaodian-public</id>
					<name>YiHaoDian public Repository</name>
					<url>http://maven.yihaodian.cn/content/repositories/public</url>
					<releases>
						<enabled>true</enabled>
						<updatePolicy>always</updatePolicy>
					</releases>
					<snapshots>
						<enabled>true</enabled>
						<updatePolicy>always</updatePolicy>
					</snapshots>
				</repository>


			</repositories>
			<pluginRepositories>
				<pluginRepository>
					<id>yihaodian-public</id>
					<name>YiHaoDian public Repository</name>
					<url>http://maven.yihaodian.cn/content/repositories/public</url>
					<releases>
						<enabled>true</enabled>
						<updatePolicy>always</updatePolicy>
					</releases>
					<snapshots>
						<enabled>true</enabled>
						<updatePolicy>always</updatePolicy>
					</snapshots>
				</pluginRepository>
			</pluginRepositories>
		</profile>
        <profile>
            <id>sonar</id>
			<activation>
                <activeByDefault>true</activeByDefault>
            </activation>
            <properties>
                <sonar.jdbc.url>jdbc:mysql://192.168.20.29:3306/sonar?useUnicode=true&amp;characterEncoding=utf8</sonar.jdbc.url>
                <sonar.jdbc.username>sonar</sonar.jdbc.username>
                <sonar.jdbc.password>sonar</sonar.jdbc.password>
                <sonar.host.url>http://192.168.20.29:9000</sonar.host.url>
            </properties>
        </profile>
	</profiles>
	
	<servers>
		<server>
			<id>yihaodian-releases</id>
			<username>jenkins</username>
			<password>jenkins</password>
		</server>
		<server>
			<id>yihaodian-snapshots</id>
			<username>jenkins</username>
			<password>jenkins</password>
		</server>
		<server>
			<id>yihaodian-public</id>
			<username>jenkins</username>
			<password>jenkins</password>
		</server>

	</servers>
</settings>

```

