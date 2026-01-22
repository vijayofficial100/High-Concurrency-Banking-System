# High-Concurrency Banking Transaction System

This project demonstrates how to handle simultaneous bank withdrawals using **Java Multithreading** and the **Concurrency API**. It ensures data integrity and prevents race conditions in a multi-user environment.

## Key Technical Features
* **Thread Safety:** Implemented `synchronized` methods to prevent the "Double-Spending" problem.
* **Efficient Thread Management:** Used `ExecutorService` with a `FixedThreadPool` to manage multiple concurrent user requests (ATM, Mobile App, and GPay).
* **Race Condition Prevention:** Ensures that the account balance is updated atomically, even when multiple transactions hit the system at the exact same millisecond.

## Tech Stack
* **Language:** Java
* **Framework:** Java Concurrency Utilities (Executor Framework)

## How it works
1. Multiple threads are created representing different transaction channels.
2. The `withdraw()` method is protected by a lock (Synchronization).
3. The system checks for sufficient balance before deducting, ensuring the balance never goes negative.
