# Canteen Ordering & Billing System (Java)

A fully menu-driven Java application that allows customers to order from 100 categorized items across Starters, Main Course, Snacks, and Desserts. The system calculates the total bill, applies GST, cashback, and loyalty points, and generates a clean, professional POS-style bill.

## Features
- 100-item categorized menu (25 per category)
- User-driven category selection
- Add items with quantity
- Automatic total calculation
- GST (18%) added
- 5% cashback for bills above ₹500
- Loyalty points based on final bill
- Classy bill formatting using Style module
- Modular multi-class structure

## Project Structure
/src
├── Menu.java # Stores all menu items & prices
├── Cart.java # Stores ordered item quantities
├── Billing.java # Calculates totals, GST, cashback, points
├── Style.java # Handles UI formatting & layout
└── CanteenSystem.java # Main menu-driven controller


## How It Works
1. User enters customer name  
2. Selects a category (Starters, Main Course, Snacks, Desserts)  
3. Chooses item and quantity  
4. System stores selection in Cart  
5. Final bill generated with:
   - Item-wise cost  
   - Subtotal  
   - GST  
   - Cashback (if applicable)  
   - Final Payable Amount  
   - Loyalty Points  

## Technologies Used
- Java  
- OOP concepts  
- Arrays  
- Menu-driven logic  

## Output Example
- Clean, formatted bill with aligned pricing  
- Stylish borders and headings  
