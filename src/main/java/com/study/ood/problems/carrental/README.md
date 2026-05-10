# Car Rental System

## 1. System Requirements

The Car Rental System allows users to rent vehicles. To practice object-oriented design, we will build a system with the following simple rules:

* The system has multiple branches (locations).
* Each branch has a variety of vehicles (cars, trucks, SUVs).
* Users can search for vehicles by type and pickup location.
* Users can book a vehicle for a specific date range.
* Each vehicle has a unique barcode and is assigned to a parking spot in a specific branch.
* Users can pay for their rental using a credit card.
* Users can add extra equipment (like a child seat or navigation system) to their reservation.
* Users must return the vehicle to the agreed drop-off branch. 
* The system charges a late fee if the user returns the vehicle after the due date.

## 2. Main Actors

* **Customer:** Searches for cars, makes reservations, and pays for the rental.
* **Receptionist:** Manages reservations, hands over the car keys, and receives returned cars.
* **System:** Sends notifications, calculates costs, and tracks vehicle status.

## 3. Key Entities

* **Vehicle:** The base class for all vehicle types.
* **Branch:** A physical location where vehicles are parked.
* **Account:** The base class for Customer and Receptionist.
* **Reservation:** Stores booking details, dates, and the assigned vehicle.
* **Equipment:** Extra items a user can rent.
* **Payment:** Handles the transaction.

## 4. Next Steps for Implementation

1. **Draw a Use Case Diagram:** Identify what each actor can do.
2. **Draw a Class Diagram:** Define the classes, their attributes, and how they connect.
3. **Write the Code:** Start creating the Java classes based on your Class Diagram.
