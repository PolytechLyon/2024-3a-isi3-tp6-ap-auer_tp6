# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme : Auer Mathéo

## Exercices 1
Ce modèle illustre le patron de conception Composite. Dans le patron de conception Composite, vous avez généralement une structure d'objets où des objets simples et des compositions d'objets sont traités de manière uniforme.

MobileObject (Interface): Ce serait le composant abstrait dans le modèle Composite. Il définit l'interface pour les objets de la composition. Dans ce cas, il s'agit des méthodes getVelocity() et getMass(), qui doivent être implémentées par tout objet mobile, qu'il soit un objet simple ou composé.

Vehicle (Classe concrète): Cette classe représente à la fois la feuille et le composite dans ce modèle. En tant que feuille, elle implémente les méthodes de l'interface MobileObject. En tant que composite, elle peut contenir des références à d'autres objets MobileObject.
## Exercices 2
La méthode getVelocity() de la classe Vehicle utilise le patron de conception Itérateur pour parcourir les composants d'un véhicule. Ce patron de conception est utilisé pour accéder aux éléments d'un objet agrégat séquentiellement sans exposer sa représentation sous-jacente.

## Exercices 3

## Exercices 4

## Exercices 5

## Exercices 6

## Exercices 7

## Exercices 8


