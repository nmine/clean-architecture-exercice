# clean-architecture-exercice
Ce projet a pour but de montrer une application simple basé sur ma présention ' BDD, DDD, TDD et living documentation'.

Il s'agit d'un use case ('création d'un challenge') réalisé en suivant les principes et techniques énoncés dans la présentation

L'application devrait permetre de créer , visualiser et suivre des 'Challenge', qui sont des défis créé par l'utilisateur que celui-ci tentera de réaliser chaque jour.

Des plugs in Maven permetant de faire de la 'living documentation' ont été ajouté (ils sont expiqué à cette adresse : https://livingdocumentation.github.io/livingdoc-maven-plugin/).

![alt text](https://user-images.githubusercontent.com/4274325/65676632-88e18f80-e050-11e9-86ad-325668dd0d8a.png)


Pour visualiser la documentation (le wordcloud, le diagramme et la visite guidée) Il faut rajouter les lignes suivantes entre les tags head des pages html :


   ```<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/d3/3.5.5/d3.min.js"></script>```
  ```<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/d3-cloud/1.2.5/d3.layout.cloud.min.js"></script>```
  ```<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/1.3.0/viz.js"></script>```
  ```<script type="text/javascript" src="https://cdn.jsdelivr.net/gh/Naereen/StrapDown.js@master/strapdown.min.js"></script>```
  
  Exercise:
  
  Implémenter le scénario suivant: 

  Scenario Outline: invalid challenge
    Given I'm authenticated as "<first_name_user>" "<last_name_user>"
    When I create an existing challenge with title "<challenge_title>" and category "<category>"
    Then I see the modification no any new challenge is created

    Examples:
      | first_name_user | last_name_user | challenge_title               |  category         |
      | Seldon          | Seldon         |                               |  alimentation     |
      | Bilbo           | Sacquet        |                               |  exercices        |
                        
Il fait partie de la feature "All user - Create challenge".

Pour ce faire, 
-ajouter le scénario dans le fichier Gherkin
-Implementer les tests (alt+enter sur le text dans le Gerkins et demander à Intelij de créer la méthode)
-Ecrire le test unitaire
-Ecrire le test d'intégration