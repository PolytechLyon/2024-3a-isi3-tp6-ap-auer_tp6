# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme : Auer Mathéo, Dupré Romain

## Exercices 1
Ce modèle illustre le patron de conception Composite. Dans le patron de conception Composite, vous avez généralement une structure d'objets où des objets simples et des compositions d'objets sont traités de manière uniforme.

MobileObject (Interface): Ce serait le composant abstrait dans le modèle Composite. Il définit l'interface pour les objets de la composition. Dans ce cas, il s'agit des méthodes getVelocity() et getMass(), qui doivent être implémentées par tout objet mobile, qu'il soit un objet simple ou composé.

Vehicle (Classe concrète): Cette classe représente à la fois la feuille et le composite dans ce modèle. En tant que feuille, elle implémente les méthodes de l'interface MobileObject. En tant que composite, elle peut contenir des références à d'autres objets MobileObject.
## Exercices 2
La méthode getVelocity() de la classe Vehicle utilise le patron de conception Itérateur pour parcourir les composants d'un véhicule. Ce patron de conception est utilisé pour accéder aux éléments d'un objet agrégat séquentiellement sans exposer sa représentation sous-jacente.

## Exercices 3
Dans cette implémentation, l'instance Clock est créée a la première fois que getInstance() est appelé. C'est ce qu'on appelle le singleton paresseux. Cela garantit que l'instance est créée uniquement lorsque nécessaire. L'instance est ensuite stockée dans la variable statique unique. Les appels suivants à getInstance() renvoient simplement l'instance déjà créée.

## Exercices 4
Les classes Bike et Wheel appartiennent à des paquetages différents : Bike est dans fr.polytech.sim.cycling tandis que Wheel est dans fr.polytech.sim.transport. Il y a une dépendance directe de Wheel vers Bike car Wheel utilise une instance de Bike pour calculer sa vitesse via la méthode getPush().
Ce type de dépendance est une dépendance directe ou explicite, elles ne sont pas idéales en termes de bonnes pratiques de conception, car elles réduisent la modularité et la réutilisabilité du code.

Pour casser la dépendance cyclique, on peut introduire une interface qui isole la fonctionnalité de poussée, par exemple une interface Pushable. Cette interface peut définir une méthode getPush(). Ensuite, la classe Bike peut implémenter cette interface. La classe Wheel peut alors dépendre de l'interface Pushable au lieu de la classe concrète Bike.
## Exercices 5
Modification de Namedlogger pour avoir un writemessage qui abstrait la méthode d'écriture de message.

## Exercices 6
Ajout d'une Factory pour créer l'instance qu'on veut d'un Logger.

Dans le contexte de l'exercice, l'utilisation du patron Singleton pourrait permettre de s'assurer qu'il n'y a qu'un seul objet Logger dans l'application, et ainsi éviter les problèmes liés à la gestion de plusieurs instances.  
Cependant, il ne permet pas de déléguer la création d'objets à des classes dérivées, contrairement au patron **méthode fabrique**.

De plus, si on utilise le patron `Singleton` on perd tout l'intérêt de notre classe `NamedLogger`. En effet, si on appelle la première fois notre getInstance() pour `Vehicle` on va lui donner le nom "Vehicule".

On aura donc une instance de `Logger` qui a "Vehicle" comme nom. Or si je rappelle getInstance() dans `BikeSimulator`, je vais récupérer un objet `Logger`avec un nom de "Vehicle" et non "BikeSimulator".
Ainsi, le patron de conception **Singleton** n'est pas adapté pour cette utilisation et on préférera le patron **méthode fabrique**.


## Exercices 7
On Applique un décorateur sur le LoggerFactory pour que avoir le timestamp à chaque logger

## Exercices 8 & 9
On utilise le paterne de conception Facade pour simplifier l'utilisation de ServiceLoader avec Context
Oui, on peut avoir plusieurs lignes dans le fichier fr.polytech.sim.cycling.Bike, et chaque ligne correspond à une implémentation différente de Bike que ServiceLoader peut charger. 
Lorsqu'il y a plusieurs implémentations, ServiceLoader peut charger une collection de ces services, permettant à notre application de parcourir et d'utiliser toutes les implémentations disponibles. 
Cependant, pour une utilisation spécifique où une seule instance est attendue (comme dans notre cas d'utilisation de simulation de vélo), nous devons nous assurer que le fichier ne liste qu'une seule implémentation à la fois, ou que la logique d'application sélectionne la bonne implémentation parmi celles disponibles.



