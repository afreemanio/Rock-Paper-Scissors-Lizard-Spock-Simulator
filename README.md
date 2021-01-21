# Rock-Paper-Scissors-Lizard-Spock CPU vs. CPU Simulator

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<p align="left">
  <p align="left">
    <a href="https://github.com/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator/issues">Report Bug</a>
    ·
    <a href="https://github.com/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator/issues">Request Feature</a>
    <br />
    <br />
    Multithreaded Rock-Paper-Scissors-Lizard-Spock CPU vs. CPU Simulation
    <br />
    <br />

  </p>

</p>

## Content
<!-- no toc -->
  - [About The Project](#about-the-project)
    - [Built With](#built-with)
    - [Features](#features)
  - [Installation](#installation)
  - [Contributing](#contributing)
  - [License](#license)
  - [Contact](#contact)
  - [License](#license)

<!-- ABOUT THE PROJECT -->

## About The Project

This is a command-line interface program that demonstrates the simplicity and capability of multithreading/concurrency techniques in the Java language.
It allows any computer to simulate and play the game of Rock-Paper-Scissors-Lizard-Spock against itself.

This program uses multiple threads and the principles of OOP to simulate "simultaneous play", as would occur in a real-life game of Rock-Paper-Scissors-Lizard-Spock.

It features two separate simulated AI players (each running on a separate thread) which each decide on a random move to play, before counting down and throwing
their move independently of each other.


<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Pierre_ciseaux_feuille_l%C3%A9zard_spock_aligned.svg/1024px-Pierre_ciseaux_feuille_l%C3%A9zard_spock_aligned.svg.png" alt="Logo" width="400" height="400">

Refer to http://en.wikipedia.org/wiki/Rock-paper-scissors-lizard-Spock for more information on the game itself.


### Built With

- [Java](https://www.java.com/)

### Features

- Use of multithreading/concurrency to allow for simultaneous play
- Demonstration of Java OOP features and principles, as well as enumerated types, switch statements, and package management
- Command line output and statistics being held in a primary (separate from the players) thread provides ample opportunity for GUI overlay and statistics generation
- Calculation of each player's moves separately, including the option to set the random seed for each player (via manipulation of source code)

## Installation

1. Download the repository files (project) from the download section or clone this project by typing in the bash the following command:

       git clone https://github.com/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator.git
2. Import it into Intellij IDEA or your Java IDE of choice
3. Run the application

Alternatively, to run it with the command line only:

1. Download the repository files (project) from the download section or clone this project by typing in the bash the following command:

       git clone https://github.com/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator.git

2. Navigate to the repository using your terminal of choice


3. With Java installed, run the command 
   
        javac -d . *.java 
    to compile the package

4. Run the command 
   
        java rockPaperScissorLizardSpock.RockPaperScissorLizardSpock
   to run the program



## Contributing

 Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/CoolNewFeature`)
3. Commit your Changes (`git commit -m 'Add some CoolNewFeature'`)
4. Push to the Branch (`git push origin feature/CoolNewFeature`)
5. Open a Pull Request


<!-- CONTACT -->

## Contact

Andrew Freeman - [@afreemanio](https://twitter.com/afreemanio) - andrewfreeman234@gmail.com

Project Link: [https://github.com/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator](https://github.com/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator)


## License

Copyright (c) 2021 Andrew Freeman

Distributed under and usage provided for under the GNU GPL-3.0 License. See [LICENSE][license-url] for the full details.

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

[contributors-shield]: https://img.shields.io/github/contributors/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator.svg?style=for-the-badge
[contributors-url]: https://github.com/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator.svg?style=for-the-badge
[forks-url]: https://github.com/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator/network/members
[stars-shield]: https://img.shields.io/github/stars/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator.svg?style=for-the-badge
[stars-url]: https://github.com/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator/stargazers
[issues-shield]: https://img.shields.io/github/issues/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator.svg?style=for-the-badge
[issues-url]: https://github.com/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator/issues
[license-shield]: https://img.shields.io/github/license/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator.svg?style=for-the-badge
[license-url]: https://github.com/afreemanio/Rock-Paper-Scissors-Lizard-Spock-Simulator/blob/master/LICENSE
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/afreemanio
[product-screenshot]: https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Pierre_ciseaux_feuille_l%C3%A9zard_spock_aligned.svg/1024px-Pierre_ciseaux_feuille_l%C3%A9zard_spock_aligned.svg.png
