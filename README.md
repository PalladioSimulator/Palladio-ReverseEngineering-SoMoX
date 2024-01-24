# Software Model Extractor (SoMoX)

[![Build Pipeline](https://github.com/PalladioSimulator/Palladio-ReverseEngineering-SoMoX/actions/workflows/build.yml/badge.svg)](https://github.com/PalladioSimulator/Palladio-ReverseEngineering-SoMoX/actions/workflows/build.yml) [![Continual Improvement Process](https://github.com/PalladioSimulator/Palladio-ReverseEngineering-SoMoX/actions/workflows/quality.yml/badge.svg)](https://github.com/PalladioSimulator/Palladio-ReverseEngineering-SoMoX/actions/workflows/quality.yml) [![GitHub Page](https://github.com/PalladioSimulator/Palladio-ReverseEngineering-SoMoX/actions/workflows/page.yml/badge.svg)](https://github.com/PalladioSimulator/Palladio-ReverseEngineering-SoMoX/actions/workflows/page.yml)

SoMoX is a reverse engineering tool developed at the Karlsruhe Institute of Technology (KIT) for generating software component models from source code. It automatically extracts different types of software components, including basic components, composite structures, interfaces, ports, and connectors. SoMoX uses various source code metrics to guide its extraction process, allowing it to adapt to the specific component definitions and needs of individual projects. SoMoX supported source code written in C/C++, Delphi and Java.

![The SoMoX logo](https://sdq.kastel.kit.edu/mediawiki-sdq-extern/images/4/45/Somox-logo01.png)

## Overview
### Key Features
- **Automatic component extraction:** SoMoX can automatically extract software components from source code without manual intervention.
- **Multi-language support:** SoMoX supports source code written in C/C++, Delphi and Java.
- **Adaptable to different component definitions:** SoMoX can be configured to extract components based on different definitions, including component-based architectures, object-oriented programming and microservices.
- **Detailed component models:** SoMoX generates comprehensive component models that include information about the component's structure, interfaces, ports, and connectors.

### Benefits
- **Improved Software Understanding:** SoMoX can help developers to better understand the architecture and structure of existing software systems.
- **Improved Maintainability:** SoMoX can simplify the maintenance of existing software by providing a structured representation of the code.
- **Simplified Code Reuse:** SoMoX can help developers identify and reuse reusable components of existing code.
- **Effective Change Impact Analysis:** SoMoX can be used to analyze the impact of code changes on software components, helping with risk assessment and decision-making.
- **Accelerated Development:** SoMoX can facilitate rapid prototyping and development by generating code from component models.

### Examples
- **Extract reusable components:** SoMoX can identify reusable components from existing code and create component models that can be used in new projects.
- **Analyze code changes:** SoMoX can be used to analyze the impact of code changes on software components, identifying potential risks and problems.
- **Generate code from models:** SoMoX can generate code from component models, simplifying rapid prototyping and new software development.
- **Document software architecture:** SoMoX can be used to create documentation of the software architecture, improving understanding and communication among developers.

## History
### Versions
SoMoX is the successor of ArchiRec. This latest version of SoMoX uses our [JDT based version of JaMoPP](https://github.com/MDSD-Tools/JaMoPP) as its backend. Previously SoMoX was available with three other backends:
- [SISSy](http://sourceforge.net/projects/sissy/)
- [MoDisco](https://eclipse.org/MoDisco/)
- [DevBoost JaMoPP](https://github.com/DevBoost/JaMoPP)

### Contributors
SoMoX was originally developed with SVN and only migrated to GIT at a late stage. This repository has also been migrated several times. As a result, not all contributors are properly visible in the history.

## Installation
SoMoX is available as an Eclipse update site and requires Java 17 and Eclipse 2023-03:
- Download the Eclipse 2023-03 modeling tools package: https://www.eclipse.org/downloads/packages/release/2023-03/r/eclipse-modeling-tools
- Install Palladio from the update site: https://updatesite.palladio-simulator.com/palladio-build-updatesite/nightly/
- Install JaMoPP from the JaMoPP update site: https://updatesite.mdsd.tools/jamopp/nightly/
- Install SoMoX from the SoMoX update site: https://updatesite.palladio-simulator.com/palladio-reverseengineering-somox/nightly/

## Documentation
This README provides basic information. For detailed instructions, examples, and advanced usage, please refer to:
- [The official documentation](https://sdq.kastel.kit.edu/wiki/SoMoX)
- [SoMoX Metric Documentation (PDF)](https://sdq.kastel.kit.edu/mediawiki-sdq-extern/images/4/49/SoMoX_Metric_Documentation.pdf)
- [Reconstruction of Software Component Architectures and Behaviour Models using Static and Dynamic Analysis](https://primo.bibliothek.kit.edu/permalink/f/4jne3t/KITSRCE1000025617)
- [Automated Coevolution of Source Code and Software Architecture Models](https://primo.bibliothek.kit.edu/permalink/f/4jne3t/KITSRCE1000081447)

## Contributing
We appreciate your contributions to make SoMoX a better tool for software development and maintenance. If you want to contribute, please follow these steps

1. Create a new issue in Jira: https://palladio-simulator.atlassian.net/browse/SOMOX
2. Fork the SoMoX repository on GitHub.
3. Create a pull request for your changes.
4. Add unit tests for your changes.
5. Document your changes.

## License
SoMoX is licensed under the [EPL-2.0 license](LICENSE).
