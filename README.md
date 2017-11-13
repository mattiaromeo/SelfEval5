# TDD Traffic jam
1. As a user I want to view a highway with name and distance.
2. As a user I want to add an incident on the highway, an incident has a name, type and distance.
3. As a user I want to view all incidents I reported.
4. As a user I want to view all users that reported an incident.
5. As a user I want to make sure the distance of a highway is larger than the distance of the incident.
6. As a user I want to search for all incidents of type TRAFFIC_JAM on a highway.
7. As a user I want to resolve an incident.
8. As a user I want multiple highways in a highway infrastructure.
9. As a user I want to search all resolved incidents that happened today on all highways.
10. As a user I want to ask the “Wegen en verkeer” if they planned any roadworks. You should ask the next interface but don’t implement it, you may stub it for Postman tests:
```java
public interface WegenEnVerkeer {

   List<RoadWorkIncidents> getRoadWorks();

}
```
11. As a user I can ask all planned incidents for a specific highway
12. As a user I want to know the duration of combined incidents of type TRAFFIC_JAM on a specific highway.
13. As a user I want to send a mail when a new incident of type ROADWORKS gets added. Don’t implement the sending of a mail.
14. As a user I want to have an indication if it is busy on the highway or not. Busy can be described if you have incident on a distance larger than 20% of the highway.
15. As a user I want to have an indication if it is busy on the highway infrastructuur. This can also be described as 20% of the global distance.
16. As a user I want to know at the end of the day what the largest incident was. Based on time and distance. (2 methods)
