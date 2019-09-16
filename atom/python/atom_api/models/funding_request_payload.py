# coding: utf-8

"""
    Hydrogen Atom API

    The Hydrogen Atom API  # noqa: E501

    OpenAPI spec version: 1.0.1
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from atom_api.models.secondary_id import SecondaryId  # noqa: F401,E501


class FundingRequestPayload(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'account_id': 'str',
        'funding_type': 'str',
        'funding_status': 'str',
        'frequency_unit': 'str',
        'is_deposit': 'bool',
        'start_date': 'date',
        'end_date': 'date',
        'last_request_date': 'date',
        'next_request_date': 'date',
        'frequency': 'int',
        'description': 'str',
        'amount': 'float',
        'bank_link_id': 'str',
        'transfer_id': 'str',
        'support_ticket_id': 'str',
        'is_active': 'bool',
        'metadata': 'object',
        'secondary_id': 'SecondaryId'
    }

    attribute_map = {
        'account_id': 'account_id',
        'funding_type': 'funding_type',
        'funding_status': 'funding_status',
        'frequency_unit': 'frequency_unit',
        'is_deposit': 'is_deposit',
        'start_date': 'start_date',
        'end_date': 'end_date',
        'last_request_date': 'last_request_date',
        'next_request_date': 'next_request_date',
        'frequency': 'frequency',
        'description': 'description',
        'amount': 'amount',
        'bank_link_id': 'bank_link_id',
        'transfer_id': 'transfer_id',
        'support_ticket_id': 'support_ticket_id',
        'is_active': 'is_active',
        'metadata': 'metadata',
        'secondary_id': 'secondary_id'
    }

    def __init__(self, account_id=None, funding_type=None, funding_status=None, frequency_unit=None, is_deposit=None, start_date=None, end_date=None, last_request_date=None, next_request_date=None, frequency=None, description=None, amount=None, bank_link_id=None, transfer_id=None, support_ticket_id=None, is_active=True, metadata=None, secondary_id=None):  # noqa: E501
        """FundingRequestPayload - a model defined in Swagger"""  # noqa: E501

        self._account_id = None
        self._funding_type = None
        self._funding_status = None
        self._frequency_unit = None
        self._is_deposit = None
        self._start_date = None
        self._end_date = None
        self._last_request_date = None
        self._next_request_date = None
        self._frequency = None
        self._description = None
        self._amount = None
        self._bank_link_id = None
        self._transfer_id = None
        self._support_ticket_id = None
        self._is_active = None
        self._metadata = None
        self._secondary_id = None
        self.discriminator = None

        self.account_id = account_id
        self.funding_type = funding_type
        self.funding_status = funding_status
        self.frequency_unit = frequency_unit
        self.is_deposit = is_deposit
        self.start_date = start_date
        if end_date is not None:
            self.end_date = end_date
        if last_request_date is not None:
            self.last_request_date = last_request_date
        if next_request_date is not None:
            self.next_request_date = next_request_date
        if frequency is not None:
            self.frequency = frequency
        if description is not None:
            self.description = description
        if amount is not None:
            self.amount = amount
        if bank_link_id is not None:
            self.bank_link_id = bank_link_id
        if transfer_id is not None:
            self.transfer_id = transfer_id
        if support_ticket_id is not None:
            self.support_ticket_id = support_ticket_id
        if is_active is not None:
            self.is_active = is_active
        if metadata is not None:
            self.metadata = metadata
        if secondary_id is not None:
            self.secondary_id = secondary_id

    @property
    def account_id(self):
        """Gets the account_id of this FundingRequestPayload.  # noqa: E501

        The ID for the account that will be receiving the funding request  # noqa: E501

        :return: The account_id of this FundingRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this FundingRequestPayload.

        The ID for the account that will be receiving the funding request  # noqa: E501

        :param account_id: The account_id of this FundingRequestPayload.  # noqa: E501
        :type: str
        """
        if account_id is None:
            raise ValueError("Invalid value for `account_id`, must not be `None`")  # noqa: E501

        self._account_id = account_id

    @property
    def funding_type(self):
        """Gets the funding_type of this FundingRequestPayload.  # noqa: E501

        The type of the funding transaction. Value may be bank_transfer, wire_transfer, cash, debit_card, credit_card, check, stock_certificate, digital_wallet, money_order, account_transfer, or other  # noqa: E501

        :return: The funding_type of this FundingRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._funding_type

    @funding_type.setter
    def funding_type(self, funding_type):
        """Sets the funding_type of this FundingRequestPayload.

        The type of the funding transaction. Value may be bank_transfer, wire_transfer, cash, debit_card, credit_card, check, stock_certificate, digital_wallet, money_order, account_transfer, or other  # noqa: E501

        :param funding_type: The funding_type of this FundingRequestPayload.  # noqa: E501
        :type: str
        """
        if funding_type is None:
            raise ValueError("Invalid value for `funding_type`, must not be `None`")  # noqa: E501
        allowed_values = ["bank_transfer", "wire_transfer", "cash", "debit_card", "credit_card", "check", "stock_certificate", "digital_wallet", "money_order", "account_transfer", "other"]  # noqa: E501
        if funding_type not in allowed_values:
            raise ValueError(
                "Invalid value for `funding_type` ({0}), must be one of {1}"  # noqa: E501
                .format(funding_type, allowed_values)
            )

        self._funding_type = funding_type

    @property
    def funding_status(self):
        """Gets the funding_status of this FundingRequestPayload.  # noqa: E501

        Status of the funding request. Value may be request_received, request_initiated, request_declined, request_cancelled, or request_completed. In the case of a recurring request, the status remains request_received until the end date of the request  # noqa: E501

        :return: The funding_status of this FundingRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._funding_status

    @funding_status.setter
    def funding_status(self, funding_status):
        """Sets the funding_status of this FundingRequestPayload.

        Status of the funding request. Value may be request_received, request_initiated, request_declined, request_cancelled, or request_completed. In the case of a recurring request, the status remains request_received until the end date of the request  # noqa: E501

        :param funding_status: The funding_status of this FundingRequestPayload.  # noqa: E501
        :type: str
        """
        if funding_status is None:
            raise ValueError("Invalid value for `funding_status`, must not be `None`")  # noqa: E501
        allowed_values = ["request_received", "request_initiated", "request_cancelled", "request_completed"]  # noqa: E501
        if funding_status not in allowed_values:
            raise ValueError(
                "Invalid value for `funding_status` ({0}), must be one of {1}"  # noqa: E501
                .format(funding_status, allowed_values)
            )

        self._funding_status = funding_status

    @property
    def frequency_unit(self):
        """Gets the frequency_unit of this FundingRequestPayload.  # noqa: E501

        Frequency of the funding request defined by your firm. Value may be one_time, daily, weekly, monthly, quarterly, or annually  # noqa: E501

        :return: The frequency_unit of this FundingRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._frequency_unit

    @frequency_unit.setter
    def frequency_unit(self, frequency_unit):
        """Sets the frequency_unit of this FundingRequestPayload.

        Frequency of the funding request defined by your firm. Value may be one_time, daily, weekly, monthly, quarterly, or annually  # noqa: E501

        :param frequency_unit: The frequency_unit of this FundingRequestPayload.  # noqa: E501
        :type: str
        """
        if frequency_unit is None:
            raise ValueError("Invalid value for `frequency_unit`, must not be `None`")  # noqa: E501
        allowed_values = ["one_time", "daily", "weekly", "monthly", "quarterly", "annually"]  # noqa: E501
        if frequency_unit not in allowed_values:
            raise ValueError(
                "Invalid value for `frequency_unit` ({0}), must be one of {1}"  # noqa: E501
                .format(frequency_unit, allowed_values)
            )

        self._frequency_unit = frequency_unit

    @property
    def is_deposit(self):
        """Gets the is_deposit of this FundingRequestPayload.  # noqa: E501

        Indicates if the funding request is a deposit. true indicates it is a deposit, false a withdrawal  # noqa: E501

        :return: The is_deposit of this FundingRequestPayload.  # noqa: E501
        :rtype: bool
        """
        return self._is_deposit

    @is_deposit.setter
    def is_deposit(self, is_deposit):
        """Sets the is_deposit of this FundingRequestPayload.

        Indicates if the funding request is a deposit. true indicates it is a deposit, false a withdrawal  # noqa: E501

        :param is_deposit: The is_deposit of this FundingRequestPayload.  # noqa: E501
        :type: bool
        """
        if is_deposit is None:
            raise ValueError("Invalid value for `is_deposit`, must not be `None`")  # noqa: E501

        self._is_deposit = is_deposit

    @property
    def start_date(self):
        """Gets the start_date of this FundingRequestPayload.  # noqa: E501

        The date that the funding request should start  # noqa: E501

        :return: The start_date of this FundingRequestPayload.  # noqa: E501
        :rtype: date
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date):
        """Sets the start_date of this FundingRequestPayload.

        The date that the funding request should start  # noqa: E501

        :param start_date: The start_date of this FundingRequestPayload.  # noqa: E501
        :type: date
        """
        if start_date is None:
            raise ValueError("Invalid value for `start_date`, must not be `None`")  # noqa: E501

        self._start_date = start_date

    @property
    def end_date(self):
        """Gets the end_date of this FundingRequestPayload.  # noqa: E501

        In the case that the funding request is recurring, the date that the funding request should stop occurring  # noqa: E501

        :return: The end_date of this FundingRequestPayload.  # noqa: E501
        :rtype: date
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date):
        """Sets the end_date of this FundingRequestPayload.

        In the case that the funding request is recurring, the date that the funding request should stop occurring  # noqa: E501

        :param end_date: The end_date of this FundingRequestPayload.  # noqa: E501
        :type: date
        """

        self._end_date = end_date

    @property
    def last_request_date(self):
        """Gets the last_request_date of this FundingRequestPayload.  # noqa: E501

        The last date a recurring deposit or withdrawal was made to/from an account  # noqa: E501

        :return: The last_request_date of this FundingRequestPayload.  # noqa: E501
        :rtype: date
        """
        return self._last_request_date

    @last_request_date.setter
    def last_request_date(self, last_request_date):
        """Sets the last_request_date of this FundingRequestPayload.

        The last date a recurring deposit or withdrawal was made to/from an account  # noqa: E501

        :param last_request_date: The last_request_date of this FundingRequestPayload.  # noqa: E501
        :type: date
        """

        self._last_request_date = last_request_date

    @property
    def next_request_date(self):
        """Gets the next_request_date of this FundingRequestPayload.  # noqa: E501

        The next date a recurring deposit or withdrawal is scheduled to/from an account  # noqa: E501

        :return: The next_request_date of this FundingRequestPayload.  # noqa: E501
        :rtype: date
        """
        return self._next_request_date

    @next_request_date.setter
    def next_request_date(self, next_request_date):
        """Sets the next_request_date of this FundingRequestPayload.

        The next date a recurring deposit or withdrawal is scheduled to/from an account  # noqa: E501

        :param next_request_date: The next_request_date of this FundingRequestPayload.  # noqa: E501
        :type: date
        """

        self._next_request_date = next_request_date

    @property
    def frequency(self):
        """Gets the frequency of this FundingRequestPayload.  # noqa: E501

        Number of frequency_unit between each request. For example, if the frequency_unit is weekly and the frequency is 2, this means the funding request occurs every two weeks. Default is 1  # noqa: E501

        :return: The frequency of this FundingRequestPayload.  # noqa: E501
        :rtype: int
        """
        return self._frequency

    @frequency.setter
    def frequency(self, frequency):
        """Sets the frequency of this FundingRequestPayload.

        Number of frequency_unit between each request. For example, if the frequency_unit is weekly and the frequency is 2, this means the funding request occurs every two weeks. Default is 1  # noqa: E501

        :param frequency: The frequency of this FundingRequestPayload.  # noqa: E501
        :type: int
        """

        self._frequency = frequency

    @property
    def description(self):
        """Gets the description of this FundingRequestPayload.  # noqa: E501

        Description for the request, such as “Initial Funding”  # noqa: E501

        :return: The description of this FundingRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this FundingRequestPayload.

        Description for the request, such as “Initial Funding”  # noqa: E501

        :param description: The description of this FundingRequestPayload.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def amount(self):
        """Gets the amount of this FundingRequestPayload.  # noqa: E501

        Amount that is included in the funding request  # noqa: E501

        :return: The amount of this FundingRequestPayload.  # noqa: E501
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this FundingRequestPayload.

        Amount that is included in the funding request  # noqa: E501

        :param amount: The amount of this FundingRequestPayload.  # noqa: E501
        :type: float
        """

        self._amount = amount

    @property
    def bank_link_id(self):
        """Gets the bank_link_id of this FundingRequestPayload.  # noqa: E501

        In the case that the funding request relates to a specific bank link, the ID of the bank link providing the funds for the funding request  # noqa: E501

        :return: The bank_link_id of this FundingRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._bank_link_id

    @bank_link_id.setter
    def bank_link_id(self, bank_link_id):
        """Sets the bank_link_id of this FundingRequestPayload.

        In the case that the funding request relates to a specific bank link, the ID of the bank link providing the funds for the funding request  # noqa: E501

        :param bank_link_id: The bank_link_id of this FundingRequestPayload.  # noqa: E501
        :type: str
        """

        self._bank_link_id = bank_link_id

    @property
    def transfer_id(self):
        """Gets the transfer_id of this FundingRequestPayload.  # noqa: E501

        In the case that the funding request relates to the transfer of an external account into the account, the ID of the transfer  # noqa: E501

        :return: The transfer_id of this FundingRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._transfer_id

    @transfer_id.setter
    def transfer_id(self, transfer_id):
        """Sets the transfer_id of this FundingRequestPayload.

        In the case that the funding request relates to the transfer of an external account into the account, the ID of the transfer  # noqa: E501

        :param transfer_id: The transfer_id of this FundingRequestPayload.  # noqa: E501
        :type: str
        """

        self._transfer_id = transfer_id

    @property
    def support_ticket_id(self):
        """Gets the support_ticket_id of this FundingRequestPayload.  # noqa: E501

        In the case that the funding request is attached to a Support Ticket in the Electron API, the ID of the ticket  # noqa: E501

        :return: The support_ticket_id of this FundingRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._support_ticket_id

    @support_ticket_id.setter
    def support_ticket_id(self, support_ticket_id):
        """Sets the support_ticket_id of this FundingRequestPayload.

        In the case that the funding request is attached to a Support Ticket in the Electron API, the ID of the ticket  # noqa: E501

        :param support_ticket_id: The support_ticket_id of this FundingRequestPayload.  # noqa: E501
        :type: str
        """

        self._support_ticket_id = support_ticket_id

    @property
    def is_active(self):
        """Gets the is_active of this FundingRequestPayload.  # noqa: E501

        Indicates if the funding request is currently active. Defaults to true which indicates it is active.  # noqa: E501

        :return: The is_active of this FundingRequestPayload.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this FundingRequestPayload.

        Indicates if the funding request is currently active. Defaults to true which indicates it is active.  # noqa: E501

        :param is_active: The is_active of this FundingRequestPayload.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def metadata(self):
        """Gets the metadata of this FundingRequestPayload.  # noqa: E501

        Custom information associated with the funding request in the format key:value.  # noqa: E501

        :return: The metadata of this FundingRequestPayload.  # noqa: E501
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this FundingRequestPayload.

        Custom information associated with the funding request in the format key:value.  # noqa: E501

        :param metadata: The metadata of this FundingRequestPayload.  # noqa: E501
        :type: object
        """

        self._metadata = metadata

    @property
    def secondary_id(self):
        """Gets the secondary_id of this FundingRequestPayload.  # noqa: E501


        :return: The secondary_id of this FundingRequestPayload.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this FundingRequestPayload.


        :param secondary_id: The secondary_id of this FundingRequestPayload.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(FundingRequestPayload, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, FundingRequestPayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
