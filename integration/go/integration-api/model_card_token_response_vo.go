/*
 * Hydrogen Integration API
 *
 * The Hydrogen Integration API
 *
 * API version: 1.3.1
 * Contact: info@hydrogenplatform.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package integration_api

type CardTokenResponseVo struct {
	ApplePayload   ApplePayload   `json:"apple_payload,omitempty"`
	GooglePayload  GooglePayload  `json:"google_payload,omitempty"`
	Message        string         `json:"message,omitempty"`
	NucleusCardId  string         `json:"nucleus_card_id,omitempty"`
	SamsungPayload SamsungPayload `json:"samsung_payload,omitempty"`
	VendorName     string         `json:"vendor_name,omitempty"`
	VendorResponse interface{}    `json:"vendor_response,omitempty"`
	Wallet         string         `json:"wallet,omitempty"`
}