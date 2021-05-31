# coding: utf-8

"""
    Hydrogen Integration API

    The Hydrogen Integration API  # noqa: E501

    OpenAPI spec version: 1.3.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from integration_api.configuration import Configuration


class CustomerRevenue(object):
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
        'accounting_method': 'str',
        'contact_id': 'str',
        'create_date': 'datetime',
        'currency_code': 'str',
        '_date': 'date',
        'id': 'str',
        'metadata': 'dict(str, str)',
        'revenue': 'float',
        'secondary_id': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'accounting_method': 'accounting_method',
        'contact_id': 'contact_id',
        'create_date': 'create_date',
        'currency_code': 'currency_code',
        '_date': 'date',
        'id': 'id',
        'metadata': 'metadata',
        'revenue': 'revenue',
        'secondary_id': 'secondary_id',
        'update_date': 'update_date'
    }

    def __init__(self, accounting_method=None, contact_id=None, create_date=None, currency_code=None, _date=None, id=None, metadata=None, revenue=None, secondary_id=None, update_date=None, _configuration=None):  # noqa: E501
        """CustomerRevenue - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._accounting_method = None
        self._contact_id = None
        self._create_date = None
        self._currency_code = None
        self.__date = None
        self._id = None
        self._metadata = None
        self._revenue = None
        self._secondary_id = None
        self._update_date = None
        self.discriminator = None

        self.accounting_method = accounting_method
        self.contact_id = contact_id
        if create_date is not None:
            self.create_date = create_date
        self.currency_code = currency_code
        self._date = _date
        if id is not None:
            self.id = id
        if metadata is not None:
            self.metadata = metadata
        self.revenue = revenue
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if update_date is not None:
            self.update_date = update_date

    @property
    def accounting_method(self):
        """Gets the accounting_method of this CustomerRevenue.  # noqa: E501

        accounting_method  # noqa: E501

        :return: The accounting_method of this CustomerRevenue.  # noqa: E501
        :rtype: str
        """
        return self._accounting_method

    @accounting_method.setter
    def accounting_method(self, accounting_method):
        """Sets the accounting_method of this CustomerRevenue.

        accounting_method  # noqa: E501

        :param accounting_method: The accounting_method of this CustomerRevenue.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and accounting_method is None:
            raise ValueError("Invalid value for `accounting_method`, must not be `None`")  # noqa: E501

        self._accounting_method = accounting_method

    @property
    def contact_id(self):
        """Gets the contact_id of this CustomerRevenue.  # noqa: E501

        contactId  # noqa: E501

        :return: The contact_id of this CustomerRevenue.  # noqa: E501
        :rtype: str
        """
        return self._contact_id

    @contact_id.setter
    def contact_id(self, contact_id):
        """Sets the contact_id of this CustomerRevenue.

        contactId  # noqa: E501

        :param contact_id: The contact_id of this CustomerRevenue.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and contact_id is None:
            raise ValueError("Invalid value for `contact_id`, must not be `None`")  # noqa: E501

        self._contact_id = contact_id

    @property
    def create_date(self):
        """Gets the create_date of this CustomerRevenue.  # noqa: E501


        :return: The create_date of this CustomerRevenue.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this CustomerRevenue.


        :param create_date: The create_date of this CustomerRevenue.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def currency_code(self):
        """Gets the currency_code of this CustomerRevenue.  # noqa: E501

        currency_code  # noqa: E501

        :return: The currency_code of this CustomerRevenue.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this CustomerRevenue.

        currency_code  # noqa: E501

        :param currency_code: The currency_code of this CustomerRevenue.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and currency_code is None:
            raise ValueError("Invalid value for `currency_code`, must not be `None`")  # noqa: E501

        self._currency_code = currency_code

    @property
    def _date(self):
        """Gets the _date of this CustomerRevenue.  # noqa: E501

        date  # noqa: E501

        :return: The _date of this CustomerRevenue.  # noqa: E501
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this CustomerRevenue.

        date  # noqa: E501

        :param _date: The _date of this CustomerRevenue.  # noqa: E501
        :type: date
        """
        if self._configuration.client_side_validation and _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def id(self):
        """Gets the id of this CustomerRevenue.  # noqa: E501


        :return: The id of this CustomerRevenue.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this CustomerRevenue.


        :param id: The id of this CustomerRevenue.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def metadata(self):
        """Gets the metadata of this CustomerRevenue.  # noqa: E501

        metadata  # noqa: E501

        :return: The metadata of this CustomerRevenue.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this CustomerRevenue.

        metadata  # noqa: E501

        :param metadata: The metadata of this CustomerRevenue.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def revenue(self):
        """Gets the revenue of this CustomerRevenue.  # noqa: E501

        revenue  # noqa: E501

        :return: The revenue of this CustomerRevenue.  # noqa: E501
        :rtype: float
        """
        return self._revenue

    @revenue.setter
    def revenue(self, revenue):
        """Sets the revenue of this CustomerRevenue.

        revenue  # noqa: E501

        :param revenue: The revenue of this CustomerRevenue.  # noqa: E501
        :type: float
        """
        if self._configuration.client_side_validation and revenue is None:
            raise ValueError("Invalid value for `revenue`, must not be `None`")  # noqa: E501

        self._revenue = revenue

    @property
    def secondary_id(self):
        """Gets the secondary_id of this CustomerRevenue.  # noqa: E501


        :return: The secondary_id of this CustomerRevenue.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this CustomerRevenue.


        :param secondary_id: The secondary_id of this CustomerRevenue.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def update_date(self):
        """Gets the update_date of this CustomerRevenue.  # noqa: E501


        :return: The update_date of this CustomerRevenue.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this CustomerRevenue.


        :param update_date: The update_date of this CustomerRevenue.  # noqa: E501
        :type: datetime
        """

        self._update_date = update_date

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
        if issubclass(CustomerRevenue, dict):
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
        if not isinstance(other, CustomerRevenue):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, CustomerRevenue):
            return True

        return self.to_dict() != other.to_dict()
