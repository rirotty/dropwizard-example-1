# dropwizard-example

## Building
### Using maven

1. Run `mvn clean package` to build your application

### Using Docker
Ensure Docker is installed. https://docs.docker.com/get-docker/

1. Run `./build.sh` to build your application

## Start the application

Run `java -jar target/dropwizard-example-1.0-SNAPSHOT.jar server config.yml`

## Calling the service
Once the service is up you can call the root endpoint at port 8080:
`curl localhost:8080`

## Configuration
The servers http port can be set via the env var `APP_PORT`.

You can for example start the application exposing port `9090` like this:
`APP_PORT=9090 java -jar target/dropwizard-example-1.0-SNAPSHOT.jar server config.yml`