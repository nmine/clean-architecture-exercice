# clean-architecture-exercice
Ce projet a pour but de montrer une application simple basé sur ma présention ' BDD, DDD, TDD et living documentation'.

Il s'agit d'un use case ('création d'un challenge') réalisé en suivant les principes et techniques énoncés dans la présentation

L'application devrait permetre de créer , visualiser et suivre des 'Challenge', qui sont des défis créé par l'utilisateur que celui-ci tentera de réaliser chaque jour.

Des plugs in Maven permetant de faire de la 'living documentation' ont été ajouté (ils sont expliqué à cette adresse : https://livingdocumentation.github.io/livingdoc-maven-plugin/).

![alt text](https://user-images.githubusercontent.com/4274325/65676632-88e18f80-e050-11e9-86ad-325668dd0d8a.png)

Les résultats des tests BDD peuvent être visualisé dans un navigateur à l'adresse {project_path}/FeatureReport/index.html.

Pour visualiser la documentation (le wordcloud, le diagramme et la visite guidée) Il faut rajouter les lignes suivantes entre les tags head des pages html :


  <br/><script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/d3/3.5.5/d3.min.js"></script>
  <br><script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/d3-cloud/1.2.5/d3.layout.cloud.min.js">    </script>
  <br><script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/1.3.0/viz.js"></script>
  <br><script type="text/javascript" src="https://cdn.jsdelivr.net/gh/Naereen/StrapDown.js@master/strapdown.min.js"></script>
  <br/>Exercise:
  <br/>1) Implémenter le scénario suivant: 
  <br/>Scenario Outline: invalid challenge
  <br/>  Given I'm authenticated as "<first_name_user>" "<last_name_user>"
  <br/>  When I create an existing challenge with title "<challenge_title>" and category "<category>"
  <br/>  Then I see the modification no any new challenge is created
  <p>
  <br/>Examples:
      <br/>| first_name_user | last_name_user | challenge_title               |  category         |
      <br/>| Seldon          | Hari           |                               |  alimentation     |
      <br/>| Bilbo           | Sacquet        |                               |  exercices        |
                        
<br/>Il fait partie de la feature "All user - Create challenge".

Pour ce faire, 
<br/> -ajouter le scénario dans le fichier Gherkin
<br/> -Implementer les tests (alt+enter sur le text dans le Gerkins et demander à Intelij de créer la méthode)
<br/> -Ecrire le code jusqu'a ce que ca plante à cause de la rêgle métier
<br/> -Ecrire le test unitaire
<br/> -Ecrire le code qui fait passer la rêgle métier
<br/> -Ecrire le test d'intégration
<br/> -Ecrire le code qui fait passer le test d'intégration
<br/>
<br/>2) Implémenter un scénario avec une nouvelle use case:
<br/>Feature:  All user - Delete challenge
  <br/>A user want to Delete a existing  challenge

  <br/>Scenario Outline: delete challenge
    <br/>Given I'm authenticated as "<first_name_user>" "<last_name_user>"
    <br/>When I delete an existing challenge with title "<challenge_title>" and category "<category>"
    <br/>Then I doesn't see any more the challenge with title "<challenge_title>" and category "<category>"

    Examples:
      | first_name_user | last_name_user | challenge_title           | category     |
      | Nicolas         | Mine           | Ne pas manger de sucre    | alimentation |
      | Bilbo           | Sacquet        | Aller à la salle de sport | exercices    |

