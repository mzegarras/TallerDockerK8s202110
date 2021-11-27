# Create projects multimodule
1. Crear root project
    ```bash
      mvn archetype:generate -DgroupId=com.odybank -DartifactId=odybank-customers -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

      mvn archetype:generate -DarchetypeGroupId=org.codehaus.mojo.archetypes -DarchetypeArtifactId=pom-root -DarchetypeVersion=RELEASE -DgroupId=com.odybank -DartifactId=odybank-customers -DinteractiveMode=false -Dversion=1.0.0-SNAPSHOT


      cd odybank-customers

      mvn archetype:generate -DgroupId=com.odybank -DartifactId=customers-repository -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

      mvn archetype:generate -DgroupId=com.odybank -DartifactId=customers-service -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

      mvn archetype:generate -DgroupId=com.odybank -DartifactId=customers-api -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

      mvn archetype:generate -DgroupId=com.odybank -DartifactId=customers-core -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

    ```
1. En el poml.xml parent
    ```xml
    <properties>
        <java.version>11</java.version>
        <maven.compiler.source>${java.version}</maven.compiler.source>
        <maven.compiler.target>${java.version}</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
    ```
1. Ingresar al url: https://start.spring.io/

1. Eliminar los tags en el pom.xml de todos los módulos: core, repository, service, api
    ```xml
    <groupId>com.odybank</groupId>
    <version>1.0-SNAPSHOT</version>
    ```
1. Agregar tags al pom.xml root:
    ```xml
    <parent>
		  <groupId>org.springframework.boot</groupId>
		  <artifactId>spring-boot-starter-parent</artifactId>
		  <version>2.6.0</version>
		  <relativePath/> <!-- lookup parent from repository -->
	  </parent>
    ```
1. En el poml.xml parent, en la sección dependencies agregar:
    ```xml
      <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>junit</groupId>
                    <artifactId>junit</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.vintage</groupId>
            <artifactId>junit-vintage-engine</artifactId>
            <scope>test</scope>
        </dependency>
      </dependencies>

1. En el poml.xml parent: dependencias del proyecto con versión y exclusión
    ```xml
    <properties>
        <commons-lang3.version>3.9</commons-lang3.version>
        <nv-i18n.version>1.27</nv-i18n.version>
    </properties>

    <dependencyManagement>
        <dependencies>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>${commons-lang3.version}</version>
        </dependency>

        <dependency>
            <groupId>com.neovisionaries</groupId>
            <artifactId>nv-i18n</artifactId>
            <version>${nv-i18n.version}</version>
        </dependency>

        </dependencies>
    </dependencyManagement>
    ```
1. En el poml.xml parent, en la sección dependencies agregar:
    ```xml
        <dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-lang3</artifactId>
        </dependency>

    ```
1. En el poml.xml, en la sección dependencies agregar:
    ```xml  
    <dependencies>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-web</artifactId>
            </dependency>

            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-test</artifactId>
                <scope>test</scope>
            </dependency>
        </dependencies>
    ```
1. En el poml.xml, del módulo -core agregar
        ```xml  
        <dependencies>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-annotations</artifactId>
        </dependency>
        <dependency>
            <groupId>com.neovisionaries</groupId>
            <artifactId>nv-i18n</artifactId>
        </dependency>
        </dependencies>
        ```
1. En el pom.xml del módulo -api agregar
    ```xml  
        <build>
            <plugins>
                <plugin>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-maven-plugin</artifactId>
                </plugin>
            </plugins>
        </build>
        ```
1. En el pom.xml del root agregar
      ```xml
    <properties>
        <odybank-customers.version>1.0.0-SNAPSHOT</odybank-customers.version>
    </properties>


     <dependencyManagement>
      <dependencies>

        <dependency>
            <groupId>com.odybank</groupId>
            <artifactId>customers-core</artifactId>
            <version>${odybank-customers.version}</version>
        </dependency>

        <dependency>
            <groupId>com.odybank</groupId>
            <artifactId>customers-repository</artifactId>
            <version>${odybank-customers.version}</version>
        </dependency>

         <dependency>
            <groupId>com.odybank</groupId>
            <artifactId>customers-service</artifactId>
            <version>${odybank-customers.version}</version>
        </dependency>

      </dependencies>
    </dependencyManagement>
    
    ```
1. En el pom.xml de repository,service, core agregar:
    ```xml
    <dependencies>
        <dependency>
            <groupId>com.odybank</groupId>
            <artifactId>customers-core</artifactId>
        </dependency>
    </dependencies>
    ```

1. En el pom.xml de service agregar:
    ```xml
    <dependencies>
        <dependency>
            <groupId>com.odybank</groupId>
            <artifactId>customers-repository</artifactId>
        </dependency>
    </dependencies>
    ```
1. En el pom.xml de api agregar:
    ```xml
    <dependencies>
        <dependency>
            <groupId>com.odybank</groupId>
            <artifactId>customers-service</artifactId>
        </dependency>
    </dependencies>
    ```  
1. En el pom.xml root
      ```xml
        <properties>
            <maven-release-plugin.version>2.5.3</maven-release-plugin.version>
            <jacoco-maven-plugin.version>0.8.5</jacoco-maven-plugin.version>
            <spotbugs-maven-plugin.version>3.1.12.2</spotbugs-maven-plugin.version>
            <findsecbugs-plugin.version>1.9.0</findsecbugs-plugin.version>
            <depgraph-maven-plugin.version>3.3.0</depgraph-maven-plugin.version>
            <maven-pmd-plugin.version>3.12.0</maven-pmd-plugin.version>
        </properties>
            
        <build>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <configuration>
                        <source>${maven.compiler.source}</source>
                        <target>${maven.compiler.target}</target>
                        <showWarnings>true</showWarnings>
                        <compilerArgs>
                            <arg>-Xlint:all</arg>
                            <arg>-Xlint:-processing</arg>
                            <arg>-Werror</arg>
                        </compilerArgs>
                    </configuration>
                </plugin>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-release-plugin</artifactId>
                    <version>${maven-release-plugin.version}</version>
                </plugin>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-deploy-plugin</artifactId>
                    <configuration>
                        <skip>true</skip>
                    </configuration>
                </plugin>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-failsafe-plugin</artifactId>
                </plugin>
                <plugin>
                    <groupId>org.jacoco</groupId>
                    <artifactId>jacoco-maven-plugin</artifactId>
                    <version>${jacoco-maven-plugin.version}</version>
                    <executions>
                        <execution>
                            <id>pre-unit-test</id>
                            <goals>
                                <goal>prepare-agent</goal>
                                <goal>prepare-agent-integration</goal>
                                <goal>report</goal>
                                <goal>report-integration</goal>
                                <goal>check</goal>
                            </goals>
                        </execution>
                    </executions>
                    <configuration>
                        <rules>
                            <rule>
                                <element>BUNDLE</element>
                                <excludes>
                                    <exclude>*Test</exclude>
                                </excludes>
                                <limits>
                                    <limit>
                                        <counter>INSTRUCTION</counter>
                                        <value>COVEREDRATIO</value>
                                        <minimum>60%</minimum>
                                    </limit>
                                </limits>
                            </rule>
                        </rules>
                    </configuration>
                </plugin>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-pmd-plugin</artifactId>
                    <version>${maven-pmd-plugin.version}</version>
                    <executions>
                        <execution>
                            <goals>
                                <goal>check</goal>
                                <goal>cpd-check</goal>
                            </goals>
                        </execution>
                    </executions>
                    <configuration>
                        <sourceEncoding>utf-8</sourceEncoding>
                        <minimumTokens>100</minimumTokens>
                        <analysisCache>true</analysisCache>
                        <printFailingErrors>true</printFailingErrors>
                        <linkXRef>false</linkXRef>
                    </configuration>
                </plugin>
                <plugin>
                    <groupId>com.github.spotbugs</groupId>
                    <artifactId>spotbugs-maven-plugin</artifactId>
                    <version>${spotbugs-maven-plugin.version}</version>
                    <executions>
                        <execution>
                            <goals>
                                <goal>check</goal>
                            </goals>
                        </execution>
                    </executions>
                    <configuration>
                        <threshold>low</threshold>
                        <plugins>
                            <plugin>
                                <groupId>com.h3xstream.findsecbugs</groupId>
                                <artifactId>findsecbugs-plugin</artifactId>
                                <version>${findsecbugs-plugin.version}</version>
                            </plugin>
                        </plugins>
                    </configuration>
                </plugin>
                <plugin>
                    <groupId>com.github.ferstl</groupId>
                    <artifactId>depgraph-maven-plugin</artifactId>
                    <version>${depgraph-maven-plugin.version}</version>
                    <configuration>
                        <outputDirectory>${project.basedir}/target/site/depgraph</outputDirectory>
                        <useArtifactIdInFileName>true</useArtifactIdInFileName>
                        <createImage>true</createImage>
                        <scope>runtime</scope>
                    </configuration>
                </plugin>
            </plugins>
        </build>
        ```
1. En el pom.xml del módulo -api agregar
    ```xml
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
    ```    