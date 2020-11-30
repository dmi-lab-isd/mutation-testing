# Mutation Testing con PIT

Per eseguire il goal per la mutation coverage è necessario prima aver compilato i test, eseguendoli per assicurarsi che sia una *green test suite* (tutti i test superati):

```text
mvn test
```

Per eseguire la mutation coverage con PIT (il report si trova in `target/pit-reports`):
```text
mvn pitest:mutationCoverage
```

Per fornire un esempio di configurazione, nel pom.xml PIT è stato configurato per:

- eseugire solo i mutatori di default;
- mutare solo la classe `BoundExample`;
- eseguire solo i test in `TestBoundExample`.

Per maggiori dettagli (oltre alle slide del corso): https://pitest.org/quickstart/maven/ 