# Android Crime Reporting & Missing Person Finder App
An Android-based mobile application designed to digitize the crime reporting process. The app enables users to report crimes and missing persons, track complaint status, and access emergency support, while administrators manage and update cases through a centralized system powered by Firebase.


## Project Overview
Traditional crime reporting systems rely heavily on physical visits to police stations and manual paperwork, which often leads to delays, lack of transparency, and limited accessibility. This application addresses these issues by providing a digital platform where users can:

- File crime complaints and missing person reports
- Track the real-time status of submitted cases
- View local crime and missing person information anonymously
- Access emergency calling and chat support

The system includes both user and admin functionalities within the same application, reducing complexity and deployment cost.


## Features
- User registration and authentication
- Crime complaint submission and tracking
- Missing person reporting with image upload
- Anonymous viewing of crime and missing person data using PIN code
- Admin dashboard for case review and status updates
- Emergency call support
- In-app chatbox for communication


## Tools & Technologies
- Android Studio
- Java
- XML
- Firebase Realtime Database
- Firebase Authentication
- Git & GitHub


## Project Structure
- `app/java/` – Android activities (Register, Login, AddComplaint, AdminDashboard, etc.)
- `app/res/layout/` – XML layout files for UI screens
- `AndroidManifest.xml` – Application configuration and permissions


## Prerequisites
Before running the application, ensure the following are available:

- Android Studio (latest stable version) – [here](https://developer.android.com/studio)
- Java JDK
- Firebase account with Realtime Database and Authentication enabled – [here](https://console.firebase.google.com)
- Android device or emulator
- Active internet connection (required for Firebase services)


## Setup Instructions
1. Clone the repository to your local system.
2. Open the project in Android Studio.
3. Configure Firebase:
   - Create a Firebase project
   - Enable Authentication and Realtime Database
   - Connect Firebase to the Android app
4. Sync Gradle files.
5. Run the application on an emulator or physical device.


## Running the Application
1. Connect an Android device or start an emulator.
2. Click Run in Android Studio.
3. Register as a new user or log in with existing credentials.
4. Use the app to file complaints, post missing person reports, or access admin features (if authorized).


## How the Application Works
This section describes the high-level workflow of the application:

- Users register and log in using secure authentication.
- Crime complaints and missing person details are submitted through structured forms.
- Data is stored in Firebase Realtime Database.
- Admin users review complaints and update their status.
- Status updates are reflected in real time for users.
- Emergency and chat features provide immediate assistance when needed.


## Handling Errors and Logs
- Input validation is implemented for critical fields such as email, password, and contact number.
- Firebase error responses are logged using Android logging mechanisms.
- User-friendly toast messages are displayed for common errors such as missing inputs or invalid credentials.
- Runtime exceptions are logged for debugging during development.


## Troubleshooting
- **App not connecting to Firebase**: Check Firebase configuration and internet connectivity.
- **Authentication issues**: Ensure Firebase Authentication is enabled and configured correctly.
- **App crashes on launch**: Verify Gradle sync and required permissions.
- **Images not uploading**: Check Firebase Storage rules and permissions.


## Testing
The application has been tested using:
- Unit testing for core logic
- Integration testing for Firebase connectivity
- Functional testing for user and admin workflows
- Manual UI testing on different screen sizes


## Conclusion
This project demonstrates the practical application of Android development and cloud-based backend services to solve real-world problems. By digitizing crime reporting and missing person tracking, the application improves accessibility, transparency, and efficiency, while providing a scalable foundation for future enhancements.



  
