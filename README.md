# Teaching-HEIGVD-AMT-2019-Project-Two

## Rapport

##### Auteurs

Baptiste Hardrick\
Miguel Gouveia

## User API

La première API est utilisée pour gérer des comptes utilisateur.\
Chaque compte a un e-mail, un nom, prenom, mot-de-passe et un booléen déterminant s'il est admin ou non.\
Un utilisateur peut changer son mot-de-passe mais pas celui d'un autre. Seul un admin le peut.\
Un administrateur peut voir tous les comptes, un utilisateur ne peut voir que le sien.\
Nous avons aussi fait en sorte que seul un compte administrateur peut créer un compte.\
Pour vérifier si un utilisateur est identifié en tant qu'administrateur ou non, il doit soumettre un token JWT reçu lorsqu'il se connecte.

### Respect des contraintes
Les contraintes ont été respectées en général, cependant nous n'avons pas implementé le container Traefik ainsi que le fait d'avoir nos back-end qui tournent sur un container.

### Lancer l'application
Commencer par lancer le script run-docker.sh\
Une fois ce dernier lancé, démarrer le script run-user-manager.sh\
Enfin pour lancer les tests Cucumber, lancer le script run-user-manager-test.sh\
Pour tester l'api, aller sur [localhost:8080/api-user-manager](http://localhost:8080/api-user-manager/swagger-ui.html) </br>

### Ce qui a été implémenté
Les features de l'API ont été décrit précédemment.\
Pour cette API, nous n'avons eu besoin d'implémenter qu'une entité: UserEntity. Celle-ci comprenait les spécifications propres à un utilisateur.\
Nous avons eu de la difficulté à implémenter des intercepteurs, ce pourquoi il n'y en a pas dans cette API.\
Nous avons implémenté deux classes utilitaires: un JWTHelper sous forme de service et une classe Utils. La première s'occupe de la génération
de token JWT ainsi que leur décodage. La seconde s'occupe du hash des mot-de-passes ainsi que de la vérification du hash contenu dans la base de donnée avec
le mot de passe soumis par l'utilisateur.\

### Tests
Nous avons testé tous les chemins implémentés dans l'API directement [ici](http://localhost:8080/api-user-manager/swagger-ui.html).\
Des tests plus rigoureux ont été implémentés de manière automatique avec Cucumber dans divers scénarios dans le dossier ```/auth-specs```.\
Ceux-ci ne testent pas tous les chemins possible mais seulement les principales contraintes comme celle de la création d'un utilisateur permise seulement par un compte
administrateur, le changement de mot de passe ainsi que le login.

### Résultat des tests
Tous nos tests ont passé:
![](https://github.com/endmon/Teaching-HEIGVD-AMT-2019-Project-Two/blob/master/doc/cucumber_a.PNG)\
![](https://github.com/endmon/Teaching-HEIGVD-AMT-2019-Project-Two/blob/master/doc/cucumber_b.PNG)\
Nous pouvons voir que tous les scénarios se passent comme prévu, nous pouvons ainsi être sûr que les routes testées n'ont pas de problème.

### Bugs et limitations
Aucun bug n'a été observé pour cette API.\
Il y a une limitation au niveau des tests; quand on lance la première fois, tous les tests passent, mais la seconde fios, un test ne passe pas.
Cela est du au fait que dans un des tests, on ajoute un utilisateur dans la base de donnée. Si on réessaie de l'ajouter une seconde fois, l'opération est refusée car il n'y a qu'un compte par adresse mail.

## Non-functional requirements

* **Automation**
  * It MUST be possible to build, run and test your project with minimal effort (you know how to use Docker Compose and how to write scripts)
* **Testing**
  * **BDD**. Implement comprehensive testing with CucumberJVM.
  * **Performance and load testing**. Implement JMeter tests for several use cases.
* **Documentation**
  * Document the decisions you made during the design of the API.
  * Document your implementation of the back-end APIs (how did you use the framework capabilities, what did you have to do to fix issues or implement special features).
  * Document what you have one to test and validate your project.
  * Document and comment your performance results (we want numbers, screenshots and an interpretation).

## Organization


**Deliverables:**

* Clean git repo, with clear instructions on the main README.md for how to build, run and test your application.
* Report as a set of markdown files in a doc folder.
* Links to the various markdown files from the main README.md files.
* What do we want to read in your report?
  * **What** you have implemented (functional aspects). Tell us briefly about the business domain you have selected and describe your business model. A diagram showing the entities and their relationships will help. A couple of screenshots too.
  * **How** you have implemented it. Tell us briefly about the components you had to use across the tiers and if you encountered issues or made choices that you find interesting.
  * You **testing strategy**: we want to see that you understand the role and value of the different types of automated tests. We want to see that you can explain what tools can be used t implement these types of tests. We want to have your opinion on the effectiveness of your test strategy (what do you like and what do you not like about your test suite?)
  * In particular a detailed report about your **experiment** to answer the performance tests. We want a clear description of the experiment. We want numbers, graphs and explanations of what they mean.
  * A list of **known bugs and limitations**.

