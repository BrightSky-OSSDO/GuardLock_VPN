# GuardLock VPN

GuardLock VPN is a fully open-source VPN built with Java Swing, offering users a completely free and unrestricted VPN experience. Unlike many VPNs that require users to pay for a VPN service after downloading the app, GuardLock VPN allows users to effortlessly download or build the application and start using it immediately, without any limitations.

## Key Features

- **Wide Range of Server Locations**: GuardLock VPN provides access to 15 countries, including Antarctica. Users can choose from 5 cities in each country, or 5 different areas in Antarctica, ensuring a diverse selection of connection options.
- **Custom IPv4 Address**: Users have the freedom to create their own custom IPv4 address for the VPN connection. With the exception of 0.0.0.0 and 255.255.255.255, users can utilize any other valid IPv4 address of their choice.
- **Multiple VPN Modes**: GuardLock VPN offers four distinct modes to optimize the VPN experience based on specific user needs. Choose from Browsing Mode for general internet browsing, Streaming Mode for high-quality video streaming, Torrenting Mode for downloading large files via torrents, or Gaming Mode for an optimized online gaming experience.
- **Flexible VPN Protocols**: Users can select from a variety of VPN protocols, including IKEv2, L2TP/IPsec, OpenVPN, PPTP, SSTP, and WireGuard. This ensures compatibility and allows users to choose the protocol that best suits their requirements.
- **Kill Switch**: GuardLock VPN includes a kill switch feature that can be enabled or disabled. When enabled, the kill switch automatically disconnects the user’s computer from the internet if the VPN connection drops, providing an extra layer of privacy and security.
- **Latency and Bandwidth Control**: Users have the ability to enable or disable latency settings, allowing them to set the desired latency time in milliseconds. Additionally, bandwidth limiting can be enabled or disabled, with the option to set the desired bandwidth amount in megabytes.
- **User-Friendly Interface**: The intuitive user interface of GuardLock VPN makes it effortless to connect and disconnect from the VPN. Simply click the large CONNECT button on the bottom left of the app to establish a connection using the current settings. Likewise, clicking the large DISCONNECT button will instantly terminate the VPN connection.

## Installation

### Download

To immediately start using GuardLock VPN, download the latest JAR file from the [releases page](https://github.com/BrightSky-OSSDO/GuardLock_VPN/releases/). Ensure that you have Java installed on your system to run the application.

### Build from Source

If you would prefer to build GuardLock VPN from source, follow these steps:

1. Download and install the NetBeans IDE.
2. Download the GuardLock VPN source code by clicking the green **Code** dropdown button in the repository and selecting **Download ZIP**. Extract the downloaded ZIP file to a location on your computer that you will remember.
3. Open the project in NetBeans. Now is the time to make any changes to the code if desired.
4. Build the project to generate the executable JAR file.

### Note

There is a known bug when attempting to open GuardLock VPN by double-clicking on the JAR file. However, you can still run the app by typing commands in the command line.

Open your operating system’s command prompt and navigate to the directory where the JAR file is located. For example, if it is located in `C:\MyFiles`, you would type:

```
cd C:\MyFiles
```

Once you’re in the directory, use the `java -jar` command to open the JAR file:

```
java -jar GuardLock_VPN-1.0.jar
```

If you’ve renamed the JAR file, be sure to replace `GuardLock_VPN-1.0.jar` with the file’s new name.

## License

GuardLock VPN is released under the GNU General Public License (GPL). Feel free to modify the code and distribute forks of the software, provided you distribute your forks under the GPL license as well.

---

We hope you find GuardLock VPN useful and enjoy the freedom and security it provides. For any questions, feedback, or issues, please open an issue on GitHub.

Thank you for choosing GuardLock VPN!
