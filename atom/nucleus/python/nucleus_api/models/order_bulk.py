# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.5
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class OrderBulk(object):
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
        'create_date': 'datetime',
        '_date': 'date',
        'id': 'str',
        'metadata': 'dict(str, str)',
        'model_id': 'str',
        'order_bulk_id': 'str',
        'order_id': 'str',
        'portfolio_id': 'str',
        'secondary_id': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'account_id': 'account_id',
        'create_date': 'create_date',
        '_date': 'date',
        'id': 'id',
        'metadata': 'metadata',
        'model_id': 'model_id',
        'order_bulk_id': 'order_bulk_id',
        'order_id': 'order_id',
        'portfolio_id': 'portfolio_id',
        'secondary_id': 'secondary_id',
        'update_date': 'update_date'
    }

    def __init__(self, account_id=None, create_date=None, _date=None, id=None, metadata=None, model_id=None, order_bulk_id=None, order_id=None, portfolio_id=None, secondary_id=None, update_date=None, _configuration=None):  # noqa: E501
        """OrderBulk - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._account_id = None
        self._create_date = None
        self.__date = None
        self._id = None
        self._metadata = None
        self._model_id = None
        self._order_bulk_id = None
        self._order_id = None
        self._portfolio_id = None
        self._secondary_id = None
        self._update_date = None
        self.discriminator = None

        self.account_id = account_id
        if create_date is not None:
            self.create_date = create_date
        self._date = _date
        if id is not None:
            self.id = id
        if metadata is not None:
            self.metadata = metadata
        self.model_id = model_id
        self.order_bulk_id = order_bulk_id
        self.order_id = order_id
        self.portfolio_id = portfolio_id
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if update_date is not None:
            self.update_date = update_date

    @property
    def account_id(self):
        """Gets the account_id of this OrderBulk.  # noqa: E501

        accountId  # noqa: E501

        :return: The account_id of this OrderBulk.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this OrderBulk.

        accountId  # noqa: E501

        :param account_id: The account_id of this OrderBulk.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and account_id is None:
            raise ValueError("Invalid value for `account_id`, must not be `None`")  # noqa: E501

        self._account_id = account_id

    @property
    def create_date(self):
        """Gets the create_date of this OrderBulk.  # noqa: E501


        :return: The create_date of this OrderBulk.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this OrderBulk.


        :param create_date: The create_date of this OrderBulk.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def _date(self):
        """Gets the _date of this OrderBulk.  # noqa: E501

        date  # noqa: E501

        :return: The _date of this OrderBulk.  # noqa: E501
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this OrderBulk.

        date  # noqa: E501

        :param _date: The _date of this OrderBulk.  # noqa: E501
        :type: date
        """
        if self._configuration.client_side_validation and _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def id(self):
        """Gets the id of this OrderBulk.  # noqa: E501


        :return: The id of this OrderBulk.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this OrderBulk.


        :param id: The id of this OrderBulk.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def metadata(self):
        """Gets the metadata of this OrderBulk.  # noqa: E501


        :return: The metadata of this OrderBulk.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this OrderBulk.


        :param metadata: The metadata of this OrderBulk.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def model_id(self):
        """Gets the model_id of this OrderBulk.  # noqa: E501

        modelId  # noqa: E501

        :return: The model_id of this OrderBulk.  # noqa: E501
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """Sets the model_id of this OrderBulk.

        modelId  # noqa: E501

        :param model_id: The model_id of this OrderBulk.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and model_id is None:
            raise ValueError("Invalid value for `model_id`, must not be `None`")  # noqa: E501

        self._model_id = model_id

    @property
    def order_bulk_id(self):
        """Gets the order_bulk_id of this OrderBulk.  # noqa: E501

        orderBulkId  # noqa: E501

        :return: The order_bulk_id of this OrderBulk.  # noqa: E501
        :rtype: str
        """
        return self._order_bulk_id

    @order_bulk_id.setter
    def order_bulk_id(self, order_bulk_id):
        """Sets the order_bulk_id of this OrderBulk.

        orderBulkId  # noqa: E501

        :param order_bulk_id: The order_bulk_id of this OrderBulk.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and order_bulk_id is None:
            raise ValueError("Invalid value for `order_bulk_id`, must not be `None`")  # noqa: E501

        self._order_bulk_id = order_bulk_id

    @property
    def order_id(self):
        """Gets the order_id of this OrderBulk.  # noqa: E501

        orderId  # noqa: E501

        :return: The order_id of this OrderBulk.  # noqa: E501
        :rtype: str
        """
        return self._order_id

    @order_id.setter
    def order_id(self, order_id):
        """Sets the order_id of this OrderBulk.

        orderId  # noqa: E501

        :param order_id: The order_id of this OrderBulk.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and order_id is None:
            raise ValueError("Invalid value for `order_id`, must not be `None`")  # noqa: E501

        self._order_id = order_id

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this OrderBulk.  # noqa: E501

        portfolioId  # noqa: E501

        :return: The portfolio_id of this OrderBulk.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this OrderBulk.

        portfolioId  # noqa: E501

        :param portfolio_id: The portfolio_id of this OrderBulk.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and portfolio_id is None:
            raise ValueError("Invalid value for `portfolio_id`, must not be `None`")  # noqa: E501

        self._portfolio_id = portfolio_id

    @property
    def secondary_id(self):
        """Gets the secondary_id of this OrderBulk.  # noqa: E501


        :return: The secondary_id of this OrderBulk.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this OrderBulk.


        :param secondary_id: The secondary_id of this OrderBulk.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def update_date(self):
        """Gets the update_date of this OrderBulk.  # noqa: E501


        :return: The update_date of this OrderBulk.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this OrderBulk.


        :param update_date: The update_date of this OrderBulk.  # noqa: E501
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
        if issubclass(OrderBulk, dict):
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
        if not isinstance(other, OrderBulk):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, OrderBulk):
            return True

        return self.to_dict() != other.to_dict()
