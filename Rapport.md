# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme : Auer Mathéo

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

## Exercices 6

## Exercices 7

## Exercices 8


