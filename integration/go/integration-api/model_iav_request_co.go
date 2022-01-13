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

type IavRequestCo struct {
	AuthToken             string                  `json:"auth_token,omitempty"`
	IsCash                bool                    `json:"is_cash,omitempty"`
	NucleusAccountId      string                  `json:"nucleus_account_id,omitempty"`
	NucleusBusinessId     string                  `json:"nucleus_business_id,omitempty"`
	NucleusClientId       string                  `json:"nucleus_client_id,omitempty"`
	NucleusTransferFields NucleusTransferFieldsCo `json:"nucleus_transfer_fields,omitempty"`
	Product               string                  `json:"product,omitempty"`
	VendorRequest         IavVendorRequestCo      `json:"vendor_request,omitempty"`
}