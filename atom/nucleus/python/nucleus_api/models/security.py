# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.3
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class Security(object):
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
        'asset_class': 'str',
        'brokers': 'list[Brokers]',
        'category': 'str',
        'create_date': 'datetime',
        'currency_code': 'str',
        'cusip': 'str',
        'description': 'str',
        'exchange': 'str',
        'id': 'str',
        'image': 'str',
        'industry': 'str',
        'is_active': 'bool',
        'isin': 'str',
        'metadata': 'dict(str, str)',
        'name': 'str',
        'proxy_id': 'str',
        'secondary_id': 'str',
        'sector': 'str',
        'security_class': 'str',
        'security_composition': 'list[SecuritiesComposition]',
        'security_country': 'list[SecuritiesCountry]',
        'ticker': 'str',
        'total_expense_ratio': 'float',
        'type': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'asset_class': 'asset_class',
        'brokers': 'brokers',
        'category': 'category',
        'create_date': 'create_date',
        'currency_code': 'currency_code',
        'cusip': 'cusip',
        'description': 'description',
        'exchange': 'exchange',
        'id': 'id',
        'image': 'image',
        'industry': 'industry',
        'is_active': 'is_active',
        'isin': 'isin',
        'metadata': 'metadata',
        'name': 'name',
        'proxy_id': 'proxy_id',
        'secondary_id': 'secondary_id',
        'sector': 'sector',
        'security_class': 'security_class',
        'security_composition': 'security_composition',
        'security_country': 'security_country',
        'ticker': 'ticker',
        'total_expense_ratio': 'total_expense_ratio',
        'type': 'type',
        'update_date': 'update_date'
    }

    def __init__(self, asset_class=None, brokers=None, category=None, create_date=None, currency_code=None, cusip=None, description=None, exchange=None, id=None, image=None, industry=None, is_active=None, isin=None, metadata=None, name=None, proxy_id=None, secondary_id=None, sector=None, security_class=None, security_composition=None, security_country=None, ticker=None, total_expense_ratio=None, type=None, update_date=None, _configuration=None):  # noqa: E501
        """Security - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._asset_class = None
        self._brokers = None
        self._category = None
        self._create_date = None
        self._currency_code = None
        self._cusip = None
        self._description = None
        self._exchange = None
        self._id = None
        self._image = None
        self._industry = None
        self._is_active = None
        self._isin = None
        self._metadata = None
        self._name = None
        self._proxy_id = None
        self._secondary_id = None
        self._sector = None
        self._security_class = None
        self._security_composition = None
        self._security_country = None
        self._ticker = None
        self._total_expense_ratio = None
        self._type = None
        self._update_date = None
        self.discriminator = None

        if asset_class is not None:
            self.asset_class = asset_class
        if brokers is not None:
            self.brokers = brokers
        if category is not None:
            self.category = category
        if create_date is not None:
            self.create_date = create_date
        if currency_code is not None:
            self.currency_code = currency_code
        if cusip is not None:
            self.cusip = cusip
        if description is not None:
            self.description = description
        if exchange is not None:
            self.exchange = exchange
        if id is not None:
            self.id = id
        if image is not None:
            self.image = image
        if industry is not None:
            self.industry = industry
        if is_active is not None:
            self.is_active = is_active
        if isin is not None:
            self.isin = isin
        if metadata is not None:
            self.metadata = metadata
        self.name = name
        if proxy_id is not None:
            self.proxy_id = proxy_id
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if sector is not None:
            self.sector = sector
        if security_class is not None:
            self.security_class = security_class
        if security_composition is not None:
            self.security_composition = security_composition
        if security_country is not None:
            self.security_country = security_country
        self.ticker = ticker
        if total_expense_ratio is not None:
            self.total_expense_ratio = total_expense_ratio
        if type is not None:
            self.type = type
        if update_date is not None:
            self.update_date = update_date

    @property
    def asset_class(self):
        """Gets the asset_class of this Security.  # noqa: E501

        Security asset class  # noqa: E501

        :return: The asset_class of this Security.  # noqa: E501
        :rtype: str
        """
        return self._asset_class

    @asset_class.setter
    def asset_class(self, asset_class):
        """Sets the asset_class of this Security.

        Security asset class  # noqa: E501

        :param asset_class: The asset_class of this Security.  # noqa: E501
        :type: str
        """

        self._asset_class = asset_class

    @property
    def brokers(self):
        """Gets the brokers of this Security.  # noqa: E501

        brokers  # noqa: E501

        :return: The brokers of this Security.  # noqa: E501
        :rtype: list[Brokers]
        """
        return self._brokers

    @brokers.setter
    def brokers(self, brokers):
        """Sets the brokers of this Security.

        brokers  # noqa: E501

        :param brokers: The brokers of this Security.  # noqa: E501
        :type: list[Brokers]
        """

        self._brokers = brokers

    @property
    def category(self):
        """Gets the category of this Security.  # noqa: E501

        Security category  # noqa: E501

        :return: The category of this Security.  # noqa: E501
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category):
        """Sets the category of this Security.

        Security category  # noqa: E501

        :param category: The category of this Security.  # noqa: E501
        :type: str
        """

        self._category = category

    @property
    def create_date(self):
        """Gets the create_date of this Security.  # noqa: E501


        :return: The create_date of this Security.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this Security.


        :param create_date: The create_date of this Security.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def currency_code(self):
        """Gets the currency_code of this Security.  # noqa: E501

        currency_code  # noqa: E501

        :return: The currency_code of this Security.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this Security.

        currency_code  # noqa: E501

        :param currency_code: The currency_code of this Security.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

    @property
    def cusip(self):
        """Gets the cusip of this Security.  # noqa: E501

        cusip  # noqa: E501

        :return: The cusip of this Security.  # noqa: E501
        :rtype: str
        """
        return self._cusip

    @cusip.setter
    def cusip(self, cusip):
        """Sets the cusip of this Security.

        cusip  # noqa: E501

        :param cusip: The cusip of this Security.  # noqa: E501
        :type: str
        """

        self._cusip = cusip

    @property
    def description(self):
        """Gets the description of this Security.  # noqa: E501

        description  # noqa: E501

        :return: The description of this Security.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this Security.

        description  # noqa: E501

        :param description: The description of this Security.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def exchange(self):
        """Gets the exchange of this Security.  # noqa: E501

        Security exchange  # noqa: E501

        :return: The exchange of this Security.  # noqa: E501
        :rtype: str
        """
        return self._exchange

    @exchange.setter
    def exchange(self, exchange):
        """Sets the exchange of this Security.

        Security exchange  # noqa: E501

        :param exchange: The exchange of this Security.  # noqa: E501
        :type: str
        """

        self._exchange = exchange

    @property
    def id(self):
        """Gets the id of this Security.  # noqa: E501


        :return: The id of this Security.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Security.


        :param id: The id of this Security.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def image(self):
        """Gets the image of this Security.  # noqa: E501

        image  # noqa: E501

        :return: The image of this Security.  # noqa: E501
        :rtype: str
        """
        return self._image

    @image.setter
    def image(self, image):
        """Sets the image of this Security.

        image  # noqa: E501

        :param image: The image of this Security.  # noqa: E501
        :type: str
        """

        self._image = image

    @property
    def industry(self):
        """Gets the industry of this Security.  # noqa: E501

        Security industry  # noqa: E501

        :return: The industry of this Security.  # noqa: E501
        :rtype: str
        """
        return self._industry

    @industry.setter
    def industry(self, industry):
        """Sets the industry of this Security.

        Security industry  # noqa: E501

        :param industry: The industry of this Security.  # noqa: E501
        :type: str
        """

        self._industry = industry

    @property
    def is_active(self):
        """Gets the is_active of this Security.  # noqa: E501

        Security is active  # noqa: E501

        :return: The is_active of this Security.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this Security.

        Security is active  # noqa: E501

        :param is_active: The is_active of this Security.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def isin(self):
        """Gets the isin of this Security.  # noqa: E501

        isin  # noqa: E501

        :return: The isin of this Security.  # noqa: E501
        :rtype: str
        """
        return self._isin

    @isin.setter
    def isin(self, isin):
        """Sets the isin of this Security.

        isin  # noqa: E501

        :param isin: The isin of this Security.  # noqa: E501
        :type: str
        """

        self._isin = isin

    @property
    def metadata(self):
        """Gets the metadata of this Security.  # noqa: E501

        metadata  # noqa: E501

        :return: The metadata of this Security.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this Security.

        metadata  # noqa: E501

        :param metadata: The metadata of this Security.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def name(self):
        """Gets the name of this Security.  # noqa: E501

        Security name  # noqa: E501

        :return: The name of this Security.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Security.

        Security name  # noqa: E501

        :param name: The name of this Security.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def proxy_id(self):
        """Gets the proxy_id of this Security.  # noqa: E501

        proxy_id  # noqa: E501

        :return: The proxy_id of this Security.  # noqa: E501
        :rtype: str
        """
        return self._proxy_id

    @proxy_id.setter
    def proxy_id(self, proxy_id):
        """Sets the proxy_id of this Security.

        proxy_id  # noqa: E501

        :param proxy_id: The proxy_id of this Security.  # noqa: E501
        :type: str
        """

        self._proxy_id = proxy_id

    @property
    def secondary_id(self):
        """Gets the secondary_id of this Security.  # noqa: E501


        :return: The secondary_id of this Security.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this Security.


        :param secondary_id: The secondary_id of this Security.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def sector(self):
        """Gets the sector of this Security.  # noqa: E501

        Security sector  # noqa: E501

        :return: The sector of this Security.  # noqa: E501
        :rtype: str
        """
        return self._sector

    @sector.setter
    def sector(self, sector):
        """Sets the sector of this Security.

        Security sector  # noqa: E501

        :param sector: The sector of this Security.  # noqa: E501
        :type: str
        """

        self._sector = sector

    @property
    def security_class(self):
        """Gets the security_class of this Security.  # noqa: E501

        Security class  # noqa: E501

        :return: The security_class of this Security.  # noqa: E501
        :rtype: str
        """
        return self._security_class

    @security_class.setter
    def security_class(self, security_class):
        """Sets the security_class of this Security.

        Security class  # noqa: E501

        :param security_class: The security_class of this Security.  # noqa: E501
        :type: str
        """

        self._security_class = security_class

    @property
    def security_composition(self):
        """Gets the security_composition of this Security.  # noqa: E501


        :return: The security_composition of this Security.  # noqa: E501
        :rtype: list[SecuritiesComposition]
        """
        return self._security_composition

    @security_composition.setter
    def security_composition(self, security_composition):
        """Sets the security_composition of this Security.


        :param security_composition: The security_composition of this Security.  # noqa: E501
        :type: list[SecuritiesComposition]
        """

        self._security_composition = security_composition

    @property
    def security_country(self):
        """Gets the security_country of this Security.  # noqa: E501


        :return: The security_country of this Security.  # noqa: E501
        :rtype: list[SecuritiesCountry]
        """
        return self._security_country

    @security_country.setter
    def security_country(self, security_country):
        """Sets the security_country of this Security.


        :param security_country: The security_country of this Security.  # noqa: E501
        :type: list[SecuritiesCountry]
        """

        self._security_country = security_country

    @property
    def ticker(self):
        """Gets the ticker of this Security.  # noqa: E501

        Security ticker  # noqa: E501

        :return: The ticker of this Security.  # noqa: E501
        :rtype: str
        """
        return self._ticker

    @ticker.setter
    def ticker(self, ticker):
        """Sets the ticker of this Security.

        Security ticker  # noqa: E501

        :param ticker: The ticker of this Security.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and ticker is None:
            raise ValueError("Invalid value for `ticker`, must not be `None`")  # noqa: E501

        self._ticker = ticker

    @property
    def total_expense_ratio(self):
        """Gets the total_expense_ratio of this Security.  # noqa: E501

        total_expense_ratio  # noqa: E501

        :return: The total_expense_ratio of this Security.  # noqa: E501
        :rtype: float
        """
        return self._total_expense_ratio

    @total_expense_ratio.setter
    def total_expense_ratio(self, total_expense_ratio):
        """Sets the total_expense_ratio of this Security.

        total_expense_ratio  # noqa: E501

        :param total_expense_ratio: The total_expense_ratio of this Security.  # noqa: E501
        :type: float
        """

        self._total_expense_ratio = total_expense_ratio

    @property
    def type(self):
        """Gets the type of this Security.  # noqa: E501

        Security type  # noqa: E501

        :return: The type of this Security.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this Security.

        Security type  # noqa: E501

        :param type: The type of this Security.  # noqa: E501
        :type: str
        """

        self._type = type

    @property
    def update_date(self):
        """Gets the update_date of this Security.  # noqa: E501


        :return: The update_date of this Security.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this Security.


        :param update_date: The update_date of this Security.  # noqa: E501
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
        if issubclass(Security, dict):
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
        if not isinstance(other, Security):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Security):
            return True

        return self.to_dict() != other.to_dict()
