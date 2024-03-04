import { GithubOutlined } from '@ant-design/icons';
import { DefaultFooter } from '@ant-design/pro-components';
import '@umijs/max';
import React from 'react';

const Footer: React.FC = () => {
  const defaultMessage = '程序员枸杞';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      style={{
        background: 'none',
      }}
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'coder-gouqi',
          title: '程序员枸杞',
          href: 'https://www.yuque.com/dogqi',
          blankTarget: true,
        },
        {
          key: 'github',
          title: (
            <>
              <GithubOutlined /> 程序员枸杞
            </>
          ),
          href: 'https://github.com/coder-gouqi',
          blankTarget: true,
        },
      ]}
    />
  );
};
export default Footer;
