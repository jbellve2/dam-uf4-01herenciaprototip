# dam-uf4-01-herenciaPrototip



## Herència Vehicles

A partir d'aquest prototip amb JavaFX, crea les classes necessàries pel funcionament del programa.

El programa permetrà visualitzar i guardar dades Vehicles a fitxers binaris. Els vehicles que hi hauran seran Taxi i Autobús.

Inclourà una llibreria externa Fitxers 5.0 (el codi el teniu ací: https://www.ies-eugeni.cat/mod/resource/view.php?id=177107 )

La llibreria ha d'estar pujada al repositori mymavenrepo o al repositori de llibreries gitLab (podeu escollir)

Aquest és el disseny de classes del programa:


![Image text](https://gitlab.com/jbellve2/dam-uf4-01-herenciaprototip/-/raw/main/imatges/herenciaVehicles.png)



## Classe Vehicle

Aquesta és la classe pare, amb les propietats que compartiran les filles. 
Aquesta classe és la que utilitzarà la llibreria externa de Fitxers i tindrà els únics mètodes que escriuen i retornen objectes a fitxers binaris. La resta de classes filles han d'utilitzar aquests mètodes.

**Utilitzarem la classe Fitxer i definim el directori per les classes derivades**

```
   protected static Fitxers f = new Fitxers();
   protected static String dir = ".data/";       // carpeta contenidora dels fitxers

```


**Per guardar vehicles a fitxer:**
```
public void guardaVehicleFitxer(String rutaFitxer){ 
        if (!f.existeix(dir))
            f.creaDirectori(dir);       // creem la carpeta contenidora si no existeix

        f.escriuObjecteFitxer(this, rutaFitxer, true); } 

```



**Per recuperar vehicles d'un fitxer: (Utilitzant la classe Fitxers f)**
```
 public <T> Object retornaVehiclesEnLlista(String arxiu,T Class) throws ClassNotFoundException {

        return f.retornaFitxerObjecteEnLlista(arxiu, Class);

    }

```

Aquest mètode ens permetrà recuperar qualsevol fitxer a una llista d'objectes.
Per a que funcione li hem de passar la classe de l'objecte i automàticament retornarà ja formatada, una llista amb els objectes de la classe Class.

Per exemple, si volem recuperar tots els vehicles Taxi, cridarem a la funció _retornaVehiclesEnLlista_ així:
```
List<Taxi> llistaTaxis=(List<Taxi>) tx.retornaVehiclesEnLlista(tx.getRutaFitxer(),Taxi.class);

```


## Classe Taxi i Autobús

Sols la classe derivada Autobús tindrà un mètode diferent de generar matrícula. Aquest mètode afegirà 2 lletres a la matrícula que simbolitzaran el pais. El pais ha de ser aleatòri entre un mínim d'almenys 5 païssos


## Classe Alerta

Aquesta classe l'utilitzarem com a utils. Definirem 2 mètodes que ens facilitarà crear missatges de la classe [Alert](https://openjfx.io/javadoc/11/javafx.controls/javafx/scene/control/Alert.html) per informar si el fitxer existeix (Missatge error) o si s'han introduït dades errònies (Missatge Warning)

La classe tindrà 2 possibles constructors:

```
    public Alerta(String missatge) {
        this.missatge = missatge;
    }

    public Alerta(String missatge, String titol) {
        this.missatge = missatge;
        this.titol = titol;
    }


```
El primer constructor s'utilitzarà si no volem passar-li cap títol al quadre de l'Alerta. Per defecte sortirà la paraula 'Error' o 'Warning' si no li passem el títol

El segon constructor és en el cas que vullga'm afegir-li un títol al quadre de l'Alerta

Com a exemple d'alerta tindrem aquests 2:

**Error**

> ![Image text](https://gitlab.com/jbellve2/dam-uf4-01-herenciaprototip/-/raw/main/imatges/alertaError.png)


**Warning**

> ![Image text](https://gitlab.com/jbellve2/dam-uf4-01-herenciaprototip/-/raw/main/imatges/alertaWarning.png)



## Organització dels paquets

Com que us passo el prototip no tindreu cap problema. En aquest prototip teniu els formularis ja dissenyats, amb les icones i els mètodes associats als botons. Però fixeu-vos com heu de distribuïr els paquets, ja que en futurs projectes ho farem d'aquesta manera.


> ![Image text](https://gitlab.com/jbellve2/dam-uf4-01-herenciaprototip/-/raw/main/imatges/organitzPaquets.png)


**_Creeu també l'executable al finalitzar el programa!!_**


## Exemples del projecte:

**Principal**

> ![Image text](https://gitlab.com/jbellve2/dam-uf4-01-herenciaprototip/-/raw/main/imatges/vehiclesPrincipal.png)

**Afegir Autobús**

> ![Image text](https://gitlab.com/jbellve2/dam-uf4-01-herenciaprototip/-/raw/main/imatges/AfegirAutobus.png)


**Mostrar Autobús**

> ![Image text](https://gitlab.com/jbellve2/dam-uf4-01-herenciaprototip/-/raw/main/imatges/llistatAutobusos.png)
