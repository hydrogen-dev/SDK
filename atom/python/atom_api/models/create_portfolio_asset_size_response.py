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

from atom_api.models.portfolio_asset_size_payload import PortfolioAssetSizePayload  # noqa: F401,E501
from atom_api.models.secondary_id import SecondaryId  # noqa: F401,E501


class CreatePortfolioAssetSizeResponse(object):
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
        '_date': 'date',
        'asset_size': 'float',
        'cash_flow': 'float',
        'portfolio_id': 'str',
        'secondary_id': 'SecondaryId',
        'id': 'str',
        'create_date': 'str'
    }

    attribute_map = {
        '_date': 'date',
        'asset_size': 'asset_size',
        'cash_flow': 'cash_flow',
        'portfolio_id': 'portfolio_id',
        'secondary_id': 'secondary_id',
        'id': 'id',
        'create_date': 'create_date'
    }

    def __init__(self, _date=None, asset_size=None, cash_flow=None, portfolio_id=None, secondary_id=None, id=None, create_date=None):  # noqa: E501
        """CreatePortfolioAssetSizeResponse - a model defined in Swagger"""  # noqa: E501

        self.__date = None
        self._asset_size = None
        self._cash_flow = None
        self._portfolio_id = None
        self._secondary_id = None
        self._id = None
        self._create_date = None
        self.discriminator = None

        self._date = _date
        self.asset_size = asset_size
        self.cash_flow = cash_flow
        self.portfolio_id = portfolio_id
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if id is not None:
            self.id = id
        if create_date is not None:
            self.create_date = create_date

    @property
    def _date(self):
        """Gets the _date of this CreatePortfolioAssetSizeResponse.  # noqa: E501

        Date for this asset size record  # noqa: E501

        :return: The _date of this CreatePortfolioAssetSizeResponse.  # noqa: E501
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this CreatePortfolioAssetSizeResponse.

        Date for this asset size record  # noqa: E501

        :param _date: The _date of this CreatePortfolioAssetSizeResponse.  # noqa: E501
        :type: date
        """
        if _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def asset_size(self):
        """Gets the asset_size of this CreatePortfolioAssetSizeResponse.  # noqa: E501

        Monetary value of the portfolio on the particular date. Can be less than, greater than or equal to 0  # noqa: E501

        :return: The asset_size of this CreatePortfolioAssetSizeResponse.  # noqa: E501
        :rtype: float
        """
        return self._asset_size

    @asset_size.setter
    def asset_size(self, asset_size):
        """Sets the asset_size of this CreatePortfolioAssetSizeResponse.

        Monetary value of the portfolio on the particular date. Can be less than, greater than or equal to 0  # noqa: E501

        :param asset_size: The asset_size of this CreatePortfolioAssetSizeResponse.  # noqa: E501
        :type: float
        """
        if asset_size is None:
            raise ValueError("Invalid value for `asset_size`, must not be `None`")  # noqa: E501

        self._asset_size = asset_size

    @property
    def cash_flow(self):
        """Gets the cash_flow of this CreatePortfolioAssetSizeResponse.  # noqa: E501

        Net monetary value that has flowed in or out of the portfolio since the last asset size date, usually via deposits or withdrawals. Can be less than, greater than or equal to 0  # noqa: E501

        :return: The cash_flow of this CreatePortfolioAssetSizeResponse.  # noqa: E501
        :rtype: float
        """
        return self._cash_flow

    @cash_flow.setter
    def cash_flow(self, cash_flow):
        """Sets the cash_flow of this CreatePortfolioAssetSizeResponse.

        Net monetary value that has flowed in or out of the portfolio since the last asset size date, usually via deposits or withdrawals. Can be less than, greater than or equal to 0  # noqa: E501

        :param cash_flow: The cash_flow of this CreatePortfolioAssetSizeResponse.  # noqa: E501
        :type: float
        """
        if cash_flow is None:
            raise ValueError("Invalid value for `cash_flow`, must not be `None`")  # noqa: E501

        self._cash_flow = cash_flow

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this CreatePortfolioAssetSizeResponse.  # noqa: E501

        The ID of the portfolio that the asset size record falls under  # noqa: E501

        :return: The portfolio_id of this CreatePortfolioAssetSizeResponse.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this CreatePortfolioAssetSizeResponse.

        The ID of the portfolio that the asset size record falls under  # noqa: E501

        :param portfolio_id: The portfolio_id of this CreatePortfolioAssetSizeResponse.  # noqa: E501
        :type: str
        """
        if portfolio_id is None:
            raise ValueError("Invalid value for `portfolio_id`, must not be `None`")  # noqa: E501

        self._portfolio_id = portfolio_id

    @property
    def secondary_id(self):
        """Gets the secondary_id of this CreatePortfolioAssetSizeResponse.  # noqa: E501


        :return: The secondary_id of this CreatePortfolioAssetSizeResponse.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this CreatePortfolioAssetSizeResponse.


        :param secondary_id: The secondary_id of this CreatePortfolioAssetSizeResponse.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

    @property
    def id(self):
        """Gets the id of this CreatePortfolioAssetSizeResponse.  # noqa: E501

        ID of the portfolio asset size record  # noqa: E501

        :return: The id of this CreatePortfolioAssetSizeResponse.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this CreatePortfolioAssetSizeResponse.

        ID of the portfolio asset size record  # noqa: E501

        :param id: The id of this CreatePortfolioAssetSizeResponse.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def create_date(self):
        """Gets the create_date of this CreatePortfolioAssetSizeResponse.  # noqa: E501

        Datetime the portfolio asset size record was created  # noqa: E501

        :return: The create_date of this CreatePortfolioAssetSizeResponse.  # noqa: E501
        :rtype: str
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this CreatePortfolioAssetSizeResponse.

        Datetime the portfolio asset size record was created  # noqa: E501

        :param create_date: The create_date of this CreatePortfolioAssetSizeResponse.  # noqa: E501
        :type: str
        """

        self._create_date = create_date

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
        if issubclass(CreatePortfolioAssetSizeResponse, dict):
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
        if not isinstance(other, CreatePortfolioAssetSizeResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
