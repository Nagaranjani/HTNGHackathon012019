This is for a Hackathon at HTNG hospitality

##About 
For HTNG hospitality hackathon, This has a Staff facing screen which fetches customer profile and updates the comments.
API uses HAPI java client to fetch customer's profile.

## Requirements

- pom.xml has swagger api
- App hosted on Tomcat server
- Uses Jersey framework
- Html with Ajax client uses rest service , MyResource.java, which in turn gets customer profile from hapi's rest service and populates on screen.
- Add java-client-generated(hapi SDK client) in class path
- Auth2.0. token needs to be generated before use.

https://key-keeper-dev.hapicloud.io/api/v1/login
{
  "repositoryAccessId": "sample",
  "repositoryAccessKey": "738d4a8b-b3a5-9e3a-bd7b-247bc92a8e10"
}
