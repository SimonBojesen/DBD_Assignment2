# DBD_Assignment2

Task 1 - Investigation
1. What is the point of using NoSQL?
* Nemmere at køre distributed systems. (Horizontal skalering)
* Det er fleksibelt da de ikke bruger skemaer. Det er nemmere at tilføje flere kolonner mm.
* Det er langt hurtigere at søge.
* Fejltolerante ved distributed systems.
* Nogle NoSQL tager stadig SQL mm. Såkaldte: “Not Only SQL” Databaser  
2. What is the CAP theorem?
* Consistency, Availability, Partition Tolerance.
* Et DB Paradigme kan ifølge CAP teorien kun have 2 ud af de 3 fordele.
* Consistency: Altid have adgang til den seneste data.
* Availability: Et system skal være tilgængeligt så tæt på 100% af tiden.
* Partition Tolerance: Systemet altid køre selv hvis der sker fejl eller delays et sted. Det handler altså om at have backup partitions kørende.
3. What are ideal use cases of HBase? 
* HBase er et column baseret DB Paradigme, der kun giver mening at bruge i cases hvor du har mange gigabytes data, gerne terabytes.
* Det er rigtig godt til at søge og finde meget lidt data i kæmpe “søer” af data.
* HBase er også rigtig godt, for når du ændre data gemmer den den gamle version.
* Konklusion: Du vil altså rigtig gerne bruge HBase når du skal lave meget store systemer hvor det er nødvendigt at gemme gamle versioner af data, i tilfælde af ændringer.
Task 2 - Bloom filters
Bloom filters are used in hbase as an incredible optimization. Solve the following.
What is a bloom filter?
Det er en datastruktur der bliver brugt til at finde ud af om et element er en del af et sæt eller ej.
What is an advantage of bloom filters over hash tables?
Et Bloom filter gemmer ikke elementerne selv, og tager derfor ikke så meget plads, da det bare er en liste af tal. 
What is a disadvantage of bloom filters? 
Et Bloom filter har den ulempe at den kan reportere falske positiver.
En anden ulempe er at de ikke supporterer sletninger.
Man kan heller ikke hente tallet ud af listen, hvis man finder ud af om det er i listen.
Kodet.
If you are to store one million ASCII strings with an average size of 10 characters in a hash set, what would be the approximate space consumption?
100.000.000 (Vi ved det ikke gætter bare ;))
How many bits per element are required for a 1% false positive rate?
	
The following equation gives the required number of bits of space per inserted key, where E is the false positive rate. b = 1.44log2(1/E)

Ved at indsætte 0.01 på E’s plads kom vi frem til tallet: 9.56736
Det vil sige vi skal bruge 10 bits per element ved en falsk positiv rate på 1%.
 How many bits per element are required for a 5% false positive rate?
Ved at indsætte 0.05 på E’s plads kom vi frem til tallet: 6.22368
Det vil sige vi skal bruge 7 bits per element ved en falsk positiv rate på 5%.

If you were to store one million ASCII strings with an average size of 10 characters in a bloom filter, what would be the approximate space consumption, given an allowed false positive rate of 5%?. 
Vi antager at skulle gange med 10 millioner da der skal gemmes 1 million strenge med 10 char størrelse.

6.22368 * 10.000.000 = 62.236.800 bits
