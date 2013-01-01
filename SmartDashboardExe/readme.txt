Inno Setup is used to create the installer.
Included in the Zip file is all of the necessary files and programs
to create the installer.

Inno Setup 5.4.3 must be installed on the computer that will be compiling the installer. 
If it isn't, run the isetup-5.4.3.exe. This will install it.

To make changes to the installer, files in the MinGW and OtherProgramFiles folders can be
modified; however, all of the files must be replaced with identically named files.
Otherwise Inno Setup will be unable to add the appropriate files to the installer.

To add or delete files, the SmartDashboardInstaller.iss file must be modified.




TO COMPILE THE INSTALLER:

1. Ensure Inno Setup 5.4.3 is installed. If it isn't, run the isetup-5.4.3.exe.

2. Open SmartDashboardInstaller.iss with Inno Setup.

3. Goto Build -> Compile

4. After the process is complete, the new Installer will be named setup.exe in the output folder.
   The output folder will most likely be in the same directory as the SmartDashboardInstaller.iss.
   If it is not use Build -> Open Output Folder in Inno Setup.