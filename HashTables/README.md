# Phone Book Application

## Use Case for the Phone Book Application:

This is a sequence of interactions that demonstrate how the phone book application works.

### Example Scenario:

1. **Add a new contact ("Emi") with phone number "624213356"**
    ```plaintext
    1
    Emi
    624213356
    ```
2. **Add another contact ("Juan") with phone number "678896253"**
    ```plaintext
    1
    Juan
    678896253
    ```
3. **List all contacts** (option 4)
    ```plaintext
    4
    ```
    - Output:
      ```plaintext
      Contacts in the phone book:
      Name: Emi, Phone: 624213356
      Name: Juan, Phone: 678896253
      ```

4. **Search for the contact "Emi"** (option 3)
    ```plaintext
    3
    Emi
    ```
    - Output:
      ```plaintext
      Emi phone number is: 624213356
      ```

5. **Delete the contact "Emi"** (option 2)
    ```plaintext
    2
    Emi
    ```
    - Output:
      ```plaintext
      Contact deleted successfully
      ```

6. **List all contacts again** (option 4)
    ```plaintext
    4
    ```
    - Output:
      ```plaintext
      Contacts in the phone book:
      Name: Juan, Phone: 678896253
      ```

7. **Delete the contact "Juan"** (option 2)
    ```plaintext
    2
    Juan
    ```
    - Output:
      ```plaintext
      Contact deleted successfully
      ```

8. **List all contacts after deleting all entries** (option 4)
    ```plaintext
    4
    ```
    - Output:
      ```plaintext
      There's no contacts in the Phone Book
      ```

9. **Try to delete "Juan" again (after it was already deleted)** (option 2)
    ```plaintext
    2
    Juan
    ```
    - Output:
      ```plaintext
      The contact does not exist
      ```

10. **Search for a non-existent contact "Arturo"** (option 3)
    ```plaintext
    3
    Arturo
    ```
    - Output:
      ```plaintext
      The contact does not exist
      ```

11. **Exit the application** (option 5)
    ```plaintext
    5
    ```
    - Output:
      ```plaintext
      Exiting...
      ```
