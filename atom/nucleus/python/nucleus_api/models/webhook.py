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


class Webhook(object):
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
        'atom_service': 'list[str]',
        'create_date': 'datetime',
        'id': 'str',
        'is_active': 'bool',
        'secondary_id': 'str',
        'secret': 'str',
        'update_date': 'datetime',
        'url': 'str'
    }

    attribute_map = {
        'atom_service': 'atom_service',
        'create_date': 'create_date',
        'id': 'id',
        'is_active': 'is_active',
        'secondary_id': 'secondary_id',
        'secret': 'secret',
        'update_date': 'update_date',
        'url': 'url'
    }

    def __init__(self, atom_service=None, create_date=None, id=None, is_active=None, secondary_id=None, secret=None, update_date=None, url=None, _configuration=None):  # noqa: E501
        """Webhook - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._atom_service = None
        self._create_date = None
        self._id = None
        self._is_active = None
        self._secondary_id = None
        self._secret = None
        self._update_date = None
        self._url = None
        self.discriminator = None

        if atom_service is not None:
            self.atom_service = atom_service
        if create_date is not None:
            self.create_date = create_date
        if id is not None:
            self.id = id
        if is_active is not None:
            self.is_active = is_active
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if secret is not None:
            self.secret = secret
        if update_date is not None:
            self.update_date = update_date
        self.url = url

    @property
    def atom_service(self):
        """Gets the atom_service of this Webhook.  # noqa: E501

        atom_service  # noqa: E501

        :return: The atom_service of this Webhook.  # noqa: E501
        :rtype: list[str]
        """
        return self._atom_service

    @atom_service.setter
    def atom_service(self, atom_service):
        """Sets the atom_service of this Webhook.

        atom_service  # noqa: E501

        :param atom_service: The atom_service of this Webhook.  # noqa: E501
        :type: list[str]
        """
        allowed_values = ["client", "client_status", "account_status", "account", "card", "card_status", "portfolio_asset_size", "portfolio_transaction", "portfolio_transaction_status", "portfolio_holding", "aggregation_account", "aggregation_account_status", "notification_client", "aggregation_account_balance", "audit_log", "support_ticket", "feature_track", "aggregation_account_transaction", "aggregation_account_transaction_status", "aggregation_account_holding", "order_track", "funding", "funding_status", "budget", "document", "client_response", "client_verified", "document_verified", "bank_link_verified"]  # noqa: E501
        if (self._configuration.client_side_validation and
                not set(atom_service).issubset(set(allowed_values))):  # noqa: E501
            raise ValueError(
                "Invalid values for `atom_service` [{0}], must be a subset of [{1}]"  # noqa: E501
                .format(", ".join(map(str, set(atom_service) - set(allowed_values))),  # noqa: E501
                        ", ".join(map(str, allowed_values)))
            )

        self._atom_service = atom_service

    @property
    def create_date(self):
        """Gets the create_date of this Webhook.  # noqa: E501


        :return: The create_date of this Webhook.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this Webhook.


        :param create_date: The create_date of this Webhook.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def id(self):
        """Gets the id of this Webhook.  # noqa: E501


        :return: The id of this Webhook.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Webhook.


        :param id: The id of this Webhook.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def is_active(self):
        """Gets the is_active of this Webhook.  # noqa: E501

        isActive  # noqa: E501

        :return: The is_active of this Webhook.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this Webhook.

        isActive  # noqa: E501

        :param is_active: The is_active of this Webhook.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def secondary_id(self):
        """Gets the secondary_id of this Webhook.  # noqa: E501


        :return: The secondary_id of this Webhook.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this Webhook.


        :param secondary_id: The secondary_id of this Webhook.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def secret(self):
        """Gets the secret of this Webhook.  # noqa: E501


        :return: The secret of this Webhook.  # noqa: E501
        :rtype: str
        """
        return self._secret

    @secret.setter
    def secret(self, secret):
        """Sets the secret of this Webhook.


        :param secret: The secret of this Webhook.  # noqa: E501
        :type: str
        """

        self._secret = secret

    @property
    def update_date(self):
        """Gets the update_date of this Webhook.  # noqa: E501


        :return: The update_date of this Webhook.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this Webhook.


        :param update_date: The update_date of this Webhook.  # noqa: E501
        :type: datetime
        """

        self._update_date = update_date

    @property
    def url(self):
        """Gets the url of this Webhook.  # noqa: E501

        url  # noqa: E501

        :return: The url of this Webhook.  # noqa: E501
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url):
        """Sets the url of this Webhook.

        url  # noqa: E501

        :param url: The url of this Webhook.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and url is None:
            raise ValueError("Invalid value for `url`, must not be `None`")  # noqa: E501

        self._url = url

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
        if issubclass(Webhook, dict):
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
        if not isinstance(other, Webhook):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Webhook):
            return True

        return self.to_dict() != other.to_dict()
