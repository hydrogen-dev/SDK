/*
 * Hydrogen Nucleus API
 *
 * The Hydrogen Nucleus API
 *
 * API version: 1.9.5
 * Contact: info@hydrogenplatform.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package nucleus_api

// BankCredit Object
type BankCredit struct {
	// amount
	Amount float64 `json:"amount"`
	// category
	Category string `json:"category,omitempty"`
	// description
	Description string    `json:"description,omitempty"`
	Location    *Location `json:"location,omitempty"`
	// memo
	Memo string `json:"memo,omitempty"`
	// merchant
	Merchant string `json:"merchant,omitempty"`
	// merchantId
	MerchantId string `json:"merchant_id,omitempty"`
	// subcategory
	Subcategory string `json:"subcategory,omitempty"`
	// transactionCategoryId
	TransactionCategoryId string `json:"transaction_category_id,omitempty"`
	// transactionType
	TransactionType string `json:"transaction_type"`
}
