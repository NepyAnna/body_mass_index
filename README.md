# body_mass_index


graph TD
    [*] --> Start
    Start --> IniInitializationByDefolt["Initialization by defolt"]
    IniInitializationByDefolt["Initialization by defolt"] --> StartController["Start Controller"]
    StartController --> GettingInput["Ask weight, Ask Height"]
    GettingInput --> SetPerson["Set Person ininstance with Inputs"]
    SetPerson --> SetBmiModel["Set BmiModel "]
     SetBmiModel --> CalculateBMI["Calculate BMI"]
    CalculateBMI --> ClassifyBMI["Classify BMI result"]
    ClassifyBMI --> ShowResults["Display BMI and classification"]
    ShowResults --> [*]