- Pokémon Data Analyzer
    - Create a functional application in Java that utilizes the PokeAPI (https://pokeapi.co/api/v2/) to perform various tasks related to Pokémon data analysis.
    - Tasks
        - Retrieve and display a list of Pokémon based on a specific type (e.g., 'water', 'fire', 'grass').
        - Compare two Pokémon and determine which one has higher base stats (HP, Attack, Defense, Special Attack, Special Defense, and Speed).
        - Given a list of Pokémon names or IDs, calculate the average base stats for the group.
        - Find the Pokémon with the highest base stat (e.g., highest HP, highest Attack) among a specified list of Pokémon.
    - Instructions for the Candidate
        - Create a new Java project using a build tool of your choice (e.g., Maven, Gradle).
        - Add necessary dependencies for making HTTP requests (e.g., OkHttp, Apache HttpClient) and JSON parsing (e.g., Gson, Jackson).
        - Implement CLI commands/REST API endpoints to interact with the PokeAPI to achieve the following tasks:
            - a. Retrieve a list of Pokémon by type
            - b. Compare the base stats of two Pokémon
            - c. Calculate the average base stats of a list of Pokémon
            - d. Find the Pokémon with the highest base stat in a specified list
        - Implement proper error handling and validation for the tasks, ensuring that the application gracefully handles common issues (e.g., invalid Pokémon names or types, API request errors).
        - Write unit tests for critical components of the application using a testing framework of your choice (e.g., JUnit, Mockito).
        - Document your application with a README file, including clear instructions on how to build, run, and test your application.
        - Additionally, use Javadoc to document important classes and methods within your code.