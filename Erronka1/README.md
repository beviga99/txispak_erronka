<<<<<<< HEAD
# Produktuak Esportatzeko Java Aplikazioa
## Helburua
Odoo bitartez, saldu eta erositako produktuak kudeatzen ditugu, produktu horiek Postgresql datu basean gordetzen dira. Java aplikazioarekin, datu basetik datuak exportatu eta csv fitxategi batean gordetzen ditugu.
## Abiaraztea
Lehenik eta behin maven apache instalatu, deskonprimitu apache-maven-3.8.3-bin.zip disko lokalean. Ondoren, gehitu sortutako apache-maven-3.8.3 direktorioaren bin direktorioa PATH ingurune aldagaiari,horretarako:<br>
1. Sisteman sartu<br>
![image](https://user-images.githubusercontent.com/61787900/136778526-705e5f55-30ab-4741-9323-fa00d4e792b8.png)<br>
2. "Opciones de configuraciones relacionadas"<br>
![image](https://user-images.githubusercontent.com/61787900/136778910-8cfcd419-421c-4a9a-9738-392d358141ea.png)<br>
3. "Propiedades del sistema"<br>
![image](https://user-images.githubusercontent.com/61787900/136780051-fa618ed6-9d5c-49d6-9b98-60775f396a92.png)<br>
4. "Variables del entorno"<br>
Bietan editatu PATH<br>
![image](https://user-images.githubusercontent.com/61787900/136795039-6451b0bd-4473-46c7-91a4-540b82d648a5.png)<br>
5. "Editar variable del entorno"<br>
![image](https://user-images.githubusercontent.com/61787900/136815417-da161c5a-d4b9-45a8-aaf9-fb1cdddf4d72.png)<br>
Gehitu sortutako apache-maven-3.8.3 direktorioaren bin direktorioa<br>
![image](https://user-images.githubusercontent.com/61787900/136800746-3739d1db-2b94-422a-a900-b098d5b649cf.png)<br>
Goian jarri,"Aceptar" eta ordenagailua berrabiarazi<br>
![image](https://user-images.githubusercontent.com/61787900/136816163-f6e96b20-6388-439a-9d55-9d958430c680.png)<br>
6. cmd<br>
cmd-en komando hau jarri mvn-v<br>
![image](https://user-images.githubusercontent.com/61787900/136816726-4bb2a8ea-b508-4ab2-ab68-fe1a160ff7bf.png)<br>
Jar sortu<br>
komando hau jarri mvn clean package spring-boot:repackage<br>
![image](https://user-images.githubusercontent.com/61787900/136821004-f4af4eeb-67f6-4316-b4ec-c7521338a86b.png)<br>
Jar exekutatzeko<br>
![image](https://user-images.githubusercontent.com/61787900/136821811-b19c1df0-3f20-4c29-81ea-7a6abcd3d10c.png)
## Klase diagrama
Hau da [Txispak.svg](https://github.com/beviga99/txispak_erronka/blob/master/Diagrama.svg) diagrama.
## Iturriak
https://elearning20.hezkuntza.net/012053/course/view.php?id=31<br>
https://github.com/Ikerrom/BeesProject-IORS/blob/main/Java/AdminApp/src/model/Model.java<br>
https://programmerclick.com/article/8320820956/<br>
https://jdbc.postgresql.org/documentation/head/connect.html<br>



=======
# TXISPAK ERRONKA
## GitHub
Gure taldeak GitHub erabili du lanaren aldaketak eta progresioa ikusteko. 
Bakoitzak branch desberdinetan lan egin du eta atal guztiak bukatzerakoan main branch-era igo ditugu.

Hemen duzu errepositorioko link-a:  
[GitHub](https://github.com/beviga99/txispak_erronka)

## Odoo


## Spring

## Diagrama
Hau da gure java aplikazioaren diagrama, bertan klase desberdinak ikusi ahal dira baita bere metodoak eta atributoak ere.

![Diagrama](https://raw.githubusercontent.com/beviga99/txispak_erronka/jon/Diagrama.svg)

## Android
Gure programan lehenik eta behin menu nagusia ikusten da. Menu nagusia honetan,
Odoon dauden produktuen zerrenda agertzen da. Produktu bakoitzak kategori baten sailkatuta dago 
eta scroll baten bidez, kategoria bat aukeratu ahal duzu. Kategoria bat aukeratu ondoren, 
kategoria horretako produktuak ikusiko ditugu.
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
