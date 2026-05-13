👤 ProfileApp - Android Multi-Activity Data Transfer
A clean, specialized Android application built to demonstrate the core principles of the Activity Lifecycle and Inter-Activity Communication using Kotlin and XML.

🎯 Project Purpose
The primary goal of this project was to master the Intent system in Android—the mechanism that allows data to travel from one screen to another. It serves as a foundation for building user-driven, multi-screen applications.

🚀 Features & Functionality
Data Entry Screen: A user-friendly interface to capture user details (Name and Age).

Input Validation: Robust logic that prevents navigation if fields are left empty, using .error feedback for a better user experience.

Secure Data Transfer: Uses Intent.putExtra() to "package" user data for delivery to the next activity.

Dynamic Profile Display: A secondary screen that "unpacks" the intent and builds a personalized greeting string dynamically.

Memory Management: Implements the finish() method on the back button to properly manage the activity stack and device resources.

🛠️ Technical Stack
Language: Kotlin

UI Framework: Android XML (LinearLayout)

Key Android Concepts:

Explicit Intents

Extra Bundles (Key-Value Pairs)

String Trimming & Validation

View Binding (via findViewById)

📂 Project Architecture
MainActivity.kt: The "Source" activity responsible for input collection and validation.

DisplayActivity.kt: The "Destination" activity that receives and displays the intent data.

activity_main.xml & activity_display.xml: XML layouts defining the visual structure and user experience.