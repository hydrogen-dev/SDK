/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.3
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.api;

import com.hydrogen.nucleus.ApiException;
import com.hydrogen.nucleus.model.Allocation;
import com.hydrogen.nucleus.model.AllocationAggregatedVO;
import com.hydrogen.nucleus.model.AllocationComposition;
import com.hydrogen.nucleus.model.DateDoubleVO;
import org.threeten.bp.LocalDate;
import com.hydrogen.nucleus.model.ModelHoldingVO;
import com.hydrogen.nucleus.model.PageAllocation;
import com.hydrogen.nucleus.model.PageAllocationComposition;
import com.hydrogen.nucleus.model.PageModelTransaction;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AllocationApi
 */
@Ignore
public class AllocationApiTest {

    private final AllocationApi api = new AllocationApi();

    
    /**
     * Create an allocation composition
     *
     * Create a new allocation composition record for an allocation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAllocationCompositionUsingPostTest() throws ApiException {
        AllocationComposition allocRequest = null;
        AllocationComposition response = api.createAllocationCompositionUsingPost(allocRequest);

        // TODO: test validations
    }
    
    /**
     * Create an allocation
     *
     * Create a new allocation for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAllocationUsingPostTest() throws ApiException {
        Allocation allocationRequest = null;
        Allocation response = api.createAllocationUsingPost(allocationRequest);

        // TODO: test validations
    }
    
    /**
     * Delete an allocation composition
     *
     * Permanently delete an allocation composition record for an allocation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAllocationCompositionUsingDeleteTest() throws ApiException {
        UUID allocationCompositionId = null;
        api.deleteAllocationCompositionUsingDelete(allocationCompositionId);

        // TODO: test validations
    }
    
    /**
     * Delete an allocation
     *
     * Permanently delete an allocation defined by your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAllocationUsingDeleteTest() throws ApiException {
        UUID allocationId = null;
        api.deleteAllocationUsingDelete(allocationId);

        // TODO: test validations
    }
    
    /**
     * List all Allocation aggregated data overview
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllocationAllAggregateDataUsingGetTest() throws ApiException {
        UUID allocationId = null;
        AllocationAggregatedVO response = api.getAllocationAllAggregateDataUsingGet(allocationId);

        // TODO: test validations
    }
    
    /**
     * List all allocation asset sizes
     *
     * Get a list of asset sizes by date for a specific allocation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllocationAllAssetSizeAllUsingGetTest() throws ApiException {
        UUID allocationId = null;
        LocalDate endDate = null;
        Boolean getLatest = null;
        Boolean isCurrentWeight = null;
        String sortType = null;
        LocalDate startDate = null;
        List<DateDoubleVO> response = api.getAllocationAllAssetSizeAllUsingGet(allocationId, endDate, getLatest, isCurrentWeight, sortType, startDate);

        // TODO: test validations
    }
    
    /**
     * List all allocation holdings
     *
     * Get the information for all securities assigned to a specific allocation. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllocationAllHoldingAllUsingGetTest() throws ApiException {
        UUID allocationId = null;
        LocalDate endDate = null;
        LocalDate startDate = null;
        List<ModelHoldingVO> response = api.getAllocationAllHoldingAllUsingGet(allocationId, endDate, startDate);

        // TODO: test validations
    }
    
    /**
     * List all allocation transactions
     *
     * Get the information for all transactions made under an allocation to achieve the composition of the allocation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllocationAllTransactionAllUsingGetTest() throws ApiException {
        UUID allocationId = null;
        Boolean ascending = null;
        LocalDate endDate = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        LocalDate startDate = null;
        PageModelTransaction response = api.getAllocationAllTransactionAllUsingGet(allocationId, ascending, endDate, orderBy, page, size, startDate);

        // TODO: test validations
    }
    
    /**
     * List all allocations
     *
     * Get details for all allocations defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllocationAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageAllocation response = api.getAllocationAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * List all allocations compositions
     *
     * Get the allocation composition for all allocations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllocationCompositionAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageAllocationComposition response = api.getAllocationCompositionAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve an allocation composition
     *
     * Retrieve the information of an allocation composition record for an allocation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllocationCompositionUsingGetTest() throws ApiException {
        UUID allocationCompositionId = null;
        AllocationComposition response = api.getAllocationCompositionUsingGet(allocationCompositionId);

        // TODO: test validations
    }
    
    /**
     * Retrieve an allocation
     *
     * Retrieve the information for an allocation defined by your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllocationUsingGetTest() throws ApiException {
        UUID allocationId = null;
        Allocation response = api.getAllocationUsingGet(allocationId);

        // TODO: test validations
    }
    
    /**
     * Update an allocation composition
     *
     * Update the information of an allocation composition record for an allocation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAllocationCompositionUsingPutTest() throws ApiException {
        Object allocationComposition = null;
        UUID allocationCompositionId = null;
        AllocationComposition response = api.updateAllocationCompositionUsingPut(allocationComposition, allocationCompositionId);

        // TODO: test validations
    }
    
    /**
     * Update an allocation
     *
     * Update an allocation defined by your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAllocationUsingPutTest() throws ApiException {
        Object allocation = null;
        UUID allocationId = null;
        Allocation response = api.updateAllocationUsingPut(allocation, allocationId);

        // TODO: test validations
    }
    
}
